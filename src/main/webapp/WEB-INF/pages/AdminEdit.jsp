<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="style.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#"><i class="material-icons">movie</i>Spi Cinemas</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>

      
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search movies" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<%System.out.println("navbar"); %>

<h3 id="formstyle">Edit Movie Details</h3>

<br />

    <div id="formstyle" >
    
        <form:form action="/AdminHome" modelAttribute="movie">
        
            <div class="form-row">
                <div class="col-md-12 mb-3">
                    <label for="moviename">Movie Name</label>
                    
                    <form:input path="title" name="moviename" class="form-control" id="validationDefault03" placeholder="Movie Name"/>
               
                </div>

            </div>
            <div class="form-row">
                <div class="col-md-3 mb-3">
                    <label for="price">Price</label>
                    <form:input path="boxOffice" class="form-control" id="validationDefault01" name="price"  placeholder="Price"/>
                </div>
                <div class="col-md-3 mb-3">
                    <label for="date">Date Of Launch</label>
                    <form:input path="dateOfLaunch" name="date" class="form-control" id="validationDefault02" value="" />
                </div>
                <div class="col-md-3 mb-3">
                    <label for="category">Category</label>
                    
                        <form:select path = "genre" class="custom-select" id="validationDefault04" name="category" >
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${countryList}" />
                  </form:select>  

                    
                </div>
                <div class="col-md-3 mb-3">
                    <label for="active">Active</label>
                    <br />
                    <div class="form-check form-check-inline">
                        <form:radiobutton path="active" class="form-check-input" name="active"  id="inlineRadio1" value="1"/>
                        <label class="form-check-label" for="active">Yes</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <form:radiobutton path="active" class="form-check-input"  name="active" id="inlineRadio2" value="0"/>
                        <label class="form-check-label" for="active">No</label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="form-check">
                    <form:checkbox path="hasTeaser" class="form-check-input"  name="teaser" value="1" id="invalidCheck2" />
                    <label class="form-check-label" for="teaser">
                        Have a teaser
                    </label>
                    
                </div>
            </div>
            <button class="btn btn-danger" type="submit">save</button>
        </form:form>
    </div>
















<div class="footer">
    <p>Copyright 2019</p>
</div>
</body>
</html>