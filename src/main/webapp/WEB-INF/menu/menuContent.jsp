<jsp:useBean id="check" scope="request" type="java.lang.String"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="img" scope="request" type="java.lang.String"/>

<div id="menus">
  ${check}
</div>
<div id="menuImg">
  <img src="${img}" alt="음식점 사진">
</div>