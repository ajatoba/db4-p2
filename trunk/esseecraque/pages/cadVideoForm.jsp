<html>
    <head>
        <title></title>
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

<form action="uploadVideo.do?act=add" enctype="multipart/form-data" method="post" onsubmit="startProgress()">

<table>

<tr>   
    <td class="form_nome">Titulo:</td>   
    <td><input type="text" name="title" maxlength="150"></td>   
</tr>   
<tr>   
    <td class="form_nome">Descricao:</td>   
    <td><input type="text" name="description"></td>   
</tr>
<tr>   
    <td class="form_nome">Vídeo:</td>
    <td>
       <input class="default" type="file" id="file1" name="file1"/><br/>
       <!-- HIDDENS PARA UPLOADS MÚLTIPLOS -->
       <input class="default" type="hidden" id="file2" name="file2"/>
       <input class="default" type="hidden" id="file3" name="file3"/>
       <input class="default" type="hidden" id="file4" name="file4"/>
       <!-- ****************************** -->
    </td>
</tr>
<tr>   
    <td colspan="2"><input type="submit" value="Upload" id="uploadbutton"/></td>
</tr>
<tr>   
    <td colspan="2">
		<div id="progressBar" style="display: none;">
			<div id="theMeter">
		    	<div id="progressBarText"></div>
				<div id="progressBarBox">
					<div id="progressBarBoxContent"></div>
				</div>
			</div>
		</div>
	</td>
</tr>

</form>
</body>
</html>