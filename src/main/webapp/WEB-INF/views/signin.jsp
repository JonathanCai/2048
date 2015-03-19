<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8"></meta>
<meta http-equiv="X-UA-Compatible" content="IE=edge"></meta>
<meta name="viewport" content="width=device-width, initial-scale=1"></meta>
<meta name="renderer" content="webkit"></meta>
<link rel="stylesheet" href="/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="/css/site.css"></link>
<link rel="stylesheet" href="/css/login.css"></link>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
<title>Welcome to Spring2048</title>
</head>
<body>
	<div class="common-wrapper">
		<header class="border-down">
			<div class="container-fluid center">
				<a title="Spring2048" href="/"><img id="logo" alt="logo" src="/image/logo.png"></img></a>
			</div>
		</header>
		<div class="container-fluid center">
			<form class="form-signin" th:action="@{/user/signin}" method="post">
				<h3 class="form-signin-heading">Have Fun!</h3>
				<input type="text" id="username" name="username" class="form-control" placeholder="Username" required="required" autofocus="autofocus"></input>
				<input type="password" id="password" name="password" class="form-control" placeholder="Password" required="required"></input>
				<div class="checkbox">
					<label> <input type="checkbox" value="remember-me"></input> Remember me
					</label>
				</div>
				<button class="btn btn-success btn-block" type="submit" id="submit">Sign&nbsp;&nbsp;&nbsp;&nbsp;In</button>
			</form>
		</div>
		<footer class="center">
			<section id="copyright">Copyright © Shallong</section>
		</footer>
	</div>

	<script src="/js/jquery.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>
</html>