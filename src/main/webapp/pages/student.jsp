<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>

<h2>Add Customer</h2>
<s:form action="addStudentAction" >
  <s:textfield name="name" label="Name" value="" />
  <s:textarea name="age" label="Age" value="" />
  <s:textfield name="id" label="ID" value="" />
  <s:submit />
</s:form>


</body>
</html>

