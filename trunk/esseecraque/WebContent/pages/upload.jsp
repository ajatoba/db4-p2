<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title><bean:message key="titulo.paginas"/></title>
        <link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css"/>
		<link href="/eec/_css/slide.css"  rel="stylesheet" type="text/css"/s>

        <script src='resources/js/upload.js'> </script>
        <script src='dwr/interface/UploadMonitor.js'> </script>
        <script src='dwr/engine.js'> </script>
        <script src='dwr/util.js'> </script>
        <style type="text/css">
            body { font: 11px Lucida Grande, Verdana, Arial, Helvetica, sans serif; }
            #progressBar { padding-top: 5px; }
            #progressBarBox { width: 350px; height: 20px; border: 1px inset; background: #eee;}
            #progressBarBoxContent { width: 0; height: 20px; border-right: 1px solid #444; background: #9ACB34; }
        </style>
      
    </head>
<body>

<!--INCLUDE DO MENU-->
<jsp:include page="/topo.jsp" />
<!--FIM INCLUDE DO MENU-->
<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<div id="erro">
			<div id="pub_video">
<div id="top_pub_video">
<div id="tit_pub_video"></div>
</div>
	<div id="conteudo_erro">	
			

<form action="pages/uploadVideo.do?act=uploadVideo" enctype="multipart/form-data" method="post" onsubmit="startProgress()">
    <p>
        <h1>Upload de Vídeo</h1>
    </p>

    <p>
       <input class="default" type="file" id="file1" name="file1"/><br/>
       <!-- HIDDENS PARA UPLOADS MÚLTIPLOS -->
       <input class="default" type="hidden" id="file2" name="file2"/>
       <input class="default" type="hidden" id="file3" name="file3"/>
       <input class="default" type="hidden" id="file4" name="file4"/>
       <!-- ****************************** -->     
        <input type="submit" value="Upload" id="uploadbutton"/>

        <br/>

        <div id="progressBar" style="display: none;">

            <div id="theMeter">
                <div id="progressBarText"></div>

                <div id="progressBarBox">
                    <div id="progressBarBoxContent"></div>
                </div>
                
             
                
            </div>
        </div>
    </p>
</form>
        </div>
            </div>
			

<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>
		
		
	</div>

<div id="direita">
		
<!--BUSCA SIMPLES-->
<div id="box_busca_simples">
<form action="busca.do?act=search" method="post">
        <div class="sep_busca"></div>
        <div class="txt_busca">
          <input type="text" name="busca" Class="txt_buscar" />
        </div>
        <div class="btn_busca"><input type="image" src="/eec/_imgs/btnbusca.jpg" name="Submit" Class="linkado" /></div>
</form>
</div>
<!--FIM-->		
		
<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="/busca.jsp" />

<!-- INCLUDE DOS VÍDEOS LATERAIS -->
						
			<div id="bnn_01"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<div id="bnn_02"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<div id="bnn_03"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="/eec/_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
</div>
</div>
<jsp:include page="/rodape.jsp" />
</body>
</html>