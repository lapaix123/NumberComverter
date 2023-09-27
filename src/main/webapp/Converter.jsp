<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Converter</title>
</head>
<body>
<h2>Converter</h2>
<form method="post" action="ConverterServlet" >
    <label>Enter Base 10 Number</label> &nbsp;<input type="text" name="baseTen" id="baseTen"><br>
    <input type="hidden" name="convType" id="convType">
    <input type="submit" value="Binary" onclick="setConvType('binary')">
    <input type="submit" value="Hexa" onclick="setConvType('hexa')">
    <input type="submit" value="Octa" onclick="setConvType('octa')">
    <input type="reset" value="Clear"><br>
</form>
<h2>Result</h2>
<label>Number :</label> <label>${number}</label><br>
<label>Result :</label> <label>${result}</label> <br>
<ul>
    <li style="color: blue">Decimal Number Converted to <label>${message}</label></li>
</ul>
<script>
    function setConvType(type) {
        document.getElementById("convType").value = type;
    }
</script>
</body>
</html>
