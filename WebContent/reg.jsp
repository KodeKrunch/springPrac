<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="validate.js"></script>
</head>
<body>
<form action="./regSubmit.ds" name="StudentRegistration" onsubmit="return(validate());">

<table cellpadding="2" width="20%" bgcolor="99FFFF" align="center"
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=4><b>Student Registration Form</b></font></center>
</td>
</tr>




<tr>
<td>Name</td>
<td><input type=text name=studentName id="textname" size="30"></td>
</tr>



<tr>
<td>City</td>
<td><select name="cityName">
<option value="-1" selected>select..</option>
<option value="New Delhi">NEW DELHI</option>
<option value="Mumbai">MUMBAI</option>
<option value="Goa">GOA</option>
<option value="Patna">PATNA</option>
</select></td>
</tr>





<tr>
<td>State</td>
<td><select Name="stateName">
<option value="-1" selected>select..</option>
<option value="New Delhi">NEW DELHI</option>
<option value="Mumbai">MUMBAI</option>
<option value="Goa">GOA</option>
<option value="Bihar">BIHAR</option>
</select></td>
</tr>
<tr>
<td>PinCode</td>
<td><input type="text" name="pincode" id="pincode" size="30"></td>

</tr>
<tr>
<td>EmailId</td>
<td><input type="text" name="emailId" id="emailid" size="30"></td>
</tr>

<tr>
<td>Password</td>
<td><input type=text name=password id="textname" size="30"></td>
</tr>

<tr>
<td>MobileNo</td>
<td><input type="text" name="mobile" id="mobileno" size="30"></td>
</tr>
<tr>

<td colspan="2">
<center>
<input type="submit" value="Submit Form" />
</center>
</td>
</tr>
</table>
</form>
</body>
</html>