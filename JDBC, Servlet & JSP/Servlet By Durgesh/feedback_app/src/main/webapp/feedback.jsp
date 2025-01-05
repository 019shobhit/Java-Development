<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="comp/linkcss.jsp" %>
  </head>
  <body>
  <%@include file = "header.jsp" %>
    
    <div class="text-white content_container py-4 d-flex flex-column justify-content-center align-items-center">
    	<h3 >Fill the Feedback form</h3>
    	
    	<form class="mt-3" action="<%=application.getContextPath() %>/feedback" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address:</label>
    <input type="email" name ="email" placeholder="enter your email I'd" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text text-white"> We'll never share your email with anyone else.</div> 
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Mobile Number: </label>
    <input type="text" placeholder="Enter your mobile number" name="phone" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3">
    <label class="form-label" for="exampleCheck1">Your Feedback Message:</label>
    <textarea name ="msg" class="form-control" rows="10" cols="" placeholder="Please write your feedBack"></textarea>
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-warning">Submit</button>
  <button type="reset" class="btn btn-light">Reset</button>
  
  </div>
</form>
    </div>
    
    
    
    <%@include file="comp/linkjs.jsp" %>
  </body>
</html>