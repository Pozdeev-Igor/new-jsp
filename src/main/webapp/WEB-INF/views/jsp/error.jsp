<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Spring Web MVC</title>
</head>
<body>
    <div>
        <div>
            <h1>Spring Web MVC</h1>
            <h2>Hello, this is an error message caused by:</h2>
            <h2>passed to URL something wrong: "${name}"</h2>
            <h2>please try again</h2>
        </div>
        <div>
            <a href="javascript:history.back()">Go Back</a>
        </div>
    </div>
</body>
</html>