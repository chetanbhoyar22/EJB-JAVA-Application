<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EJB application</title>
</head>
<body>
<h2>NetBanking Application</h2>
<hr>
<form method="post" action="ShowInterest">
<table>
    <tr>
        <td>Account type</td>
        <td>
            <select name="typ">
                <option value="saving">Saving</option>
                <option value="fixed">Fixed</option>
                <option value="current">Current</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>Amount</td>
        <td><input type="text" name="amt"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Submit"></td>
        <td></td>
    </tr>
</table>
</form>
</body>
</html>