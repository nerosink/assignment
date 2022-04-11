<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Enterprise Admin</title>
</head>
<body>

<h1>Create Enterprise</h1>
<form id="login-form">
    <label for="name">Name</label>
    <input text type="text" name="name" id="name"><br>
    <label for="url">Url</label>
    <input type="text" name="url" id="url"><br>
    <label for="authentication">authentication</label>
    <input type="text" name="authentication" id="authentication"><br>
    <input type="submit" value="Submit"><br>
</form>
<script>
    var form = document.getElementById('login-form');
    form.onsubmit = function(event){
        var xhr = new XMLHttpRequest();
        var formData = new FormData(form);
        //open the request
        xhr.open('POST','http://localhost:8080/enterprise')
        xhr.setRequestHeader("Content-Type", "application/json");

        //send the form data
        xhr.send(JSON.stringify(Object.fromEntries(formData)));

        xhr.onreadystatechange = function() {
            if (xhr.readyState == XMLHttpRequest.DONE) {
                form.reset(); //reset form after AJAX success or do something else
            }
        }
        //Fail the onsubmit to avoid page refresh.
        return false; 
    }
</script>
</body>
</html>