<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/showPicture.css"/>
<script src="${pageContext.request.contextPath}/js/jquery-2.1.3.js"></script>
<script src="${pageContext.request.contextPath}/js/index.js"></script>
<body>

<div id="uploadFileDiv">

    <%--<img id="uploadFilePreview" class="preview" src="imgs/img-2-benchi.jpg" alt="benchi"/><br/><br/>--%>
    <form action="basicUploadFile.do" method="post" enctype="multipart/form-data">
        <p>
            <input id="uploadFile" type="file"/>${result}<br/>
        </p>
        <p>
            <input type="reset" value="reset"/>
            <input type="submit" value="submit"/>
        </p>
    </form>
</div>

<div id="showPicture">
    <h2>File Upload</h2>
    <img id="preview" class="preview" src="imgs/img-2-benchi.jpg" alt="benchi"/><br/><br/>
    <a href="imgs/img-2-benchi.jpg" title="benchi"><img src="imgs/img-1-benchi.jpg" alt="benchi"/></a>
    <a href="imgs/img-2-chenhong.jpg" title="chenhong"><img src="imgs/img-1-chenhong.jpg" alt="chenhong"/></a>
    <a href="imgs/img-2-liuyan.jpg" title="liuyan"><img src="imgs/img-1-liuyan.jpg" alt="liuyan"/></a>
    <a href="imgs/img-2-liuyifei.jpg" title="liuyifei"><img src="imgs/img-1-liuyifei.jpg" alt="liuyifei"/></a>
    <a href="imgs/img-2-shishi.jpg" title="shishi"><img src="imgs/img-1-shishi.jpg" alt="shishi"/></a>
</div>

<div id="previewImgDiv"></div>
</body>
</html>
