<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Template Engine</title>
</head>
<body>
    <p>Hello, ${name}</p>
    <table>
        <thead>
            <tr>
                <td>NAME</td>
                <td>SURNAME</td>
                <td>AGE</td>
                <td>GROUP</td>
            </tr>
        </thead>
        <tbody>
        <#list students as student>
            <tr>
                <td>${student.getName()}</td>
                <td>${student.surname}</td>
                <td>${student.getAge()}</td>
                <td>${student.group}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</body>
</html>