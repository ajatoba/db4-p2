package esseecraque.model.util;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import esseecraque.model.vo.EmailVO;

public class Mailer {

	private static final Mailer INSTANCE = new Mailer();
	private static Session mailSession;
	private String username;
	private String password;

	public static Mailer getInstance() {
		return INSTANCE;
	}

	private Mailer() {
		super();

		Properties props = new Properties();
		InitialContext ictx;
		try {
			ictx = new InitialContext(props);
			mailSession = (Session) ictx.lookup("java:/Mail");
			username = (String) props.get("mail.smtps.user");
			password = (String) props.get("mail.smtps.password");

		} catch (NamingException e) {
			LoggerUtil.error(e.getMessage(), e);
		}
	}

	public void sendMsg(EmailVO email) throws MessagingException {

		MimeMessage message = new MimeMessage(mailSession);
		message.setSubject(email.getTitulo());
		message.setRecipients(javax.mail.Message.RecipientType.TO,
				javax.mail.internet.InternetAddress.parse(email
						.getDestinatario(), false));
		message.setText(email.getCorpo());
		message.setFrom(new InternetAddress(email.getRemetente()));
		message.saveChanges();

		Transport transport = mailSession.getTransport("smtps");
		try {
			transport.connect(username, password);

			transport.sendMessage(message, message.getAllRecipients());
			LoggerUtil.info("Message sent:" + message.toString());
		} finally {
			transport.close();
		}
	}
}
