<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <!--  <link rel="stylesheet" href="makercheckerlogin.css"> -->
  
  <%-- <link href="<c:url value="/View/makercheckerlogin.css" />" rel="stylesheet"/> --%>
<title> Insert Customer Details</title>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="p" %>
<p:url value="resources/makercheckerlogin.css" var="k"/>
<link href="${k}" rel="stylesheet"/>
<p:url value="resources/Validation.js" var="km"/>
<link href="${km}" rel="stylesheet"/>
<%@include file="makerfunctions.jsp" %>

</head>
<body>

<div class="d-md-flex h-md-100 align-items-center">
<div class="col-md-6 p-0 bg-indigo h-md-100">
    <div class="text-white d-md-flex align-items-center h-100 p-5 text-center justify-content-center">
        <div class="logoarea pt-5 pb-5">
${flag}

 <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
 <div id="formFooter"  style="background-color:#e3f2fd; color:#5fbae9">
      <h1> Insert Customer Details</h1>
    </div>
 
      
                
                <s:form action="insertCustomer" modelAttribute="customer" onsubmit="return validateemail()">
                
               <p:message code="label.customer.customerCode" var="code"> </p:message> <s:input path="customerCode" placeholder="${code}"/><s:errors path="customerCode"/>
                <p:message code="label.customer.customerName" var="name"> </p:message> <s:input path="customerName" placeholder="${name}"/><s:errors path="customerName"/>
                 <p:message code="label.customer.address1" var="addrs1"> </p:message> <s:input path="address1" placeholder="${addrs1}"/><s:errors path="address1"/>
                  <p:message code="label.customer.address2" var="addrs2" > </p:message> <s:input path="address2" placeholder="${addrs2}"/><s:errors path="address2"/>
                   <p:message code="label.customer.pinCode" var="pin"> </p:message> <s:input path="pinCode" placeholder="${pin}"/><s:errors path="pinCode"/>
                    <p:message code="label.customer.email" var="email"> </p:message> <s:input path="email" placeholder="${email}" /><s:errors path="email"/>
                     <p:message code="label.customer.contactNo" var="no"> </p:message> <s:input path="contactNo" placeholder="${no}"/><s:errors path="contactNo"/>
                      <p:message code="label.customer.contactPerson" var="person"> </p:message> <s:input path="contactPerson" placeholder="${person}" /><s:errors path="contactPerson"/>
               
                <br>
                <br>
                
  
  <div class="dropdown">
  
  <s:select path="inactiveFlag" class="btn btn-default dropdown-toggle" data-toggle="dropdown" >
  
  <s:option value="A">Active</s:option>
  <s:option value="I">Inactive</s:option>
  
  </s:select>
  </div>
        <br>
      <br>
      
      
      <input type="submit" class="fadeIn fourth" name ="button" value="Insert" >
   </s:form>
  

   
  </div>
</div> 
</div>
    </div>
</div>



<div class="col-md-6 p-0 bg-white h-md-100 loginarea" >
    <div class="d-md-flex align-items-center h-md-100 p-5 justify-content-center">
        Second half content here
    </div>
</div>
    
</div>
</body>
</html>