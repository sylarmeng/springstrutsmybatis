<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>Struts 2 + Spring + Hibernate integration example</h1>

 <s:iterator value="list">
 <s:property value="id"/>
 <s:property value="name"/>
 <s:property value="age"/>
 </s:iterator>

<br/>
<br/>

</body>
</html>