<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="style.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

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

       <li class="nav-item active">
        <a class="nav-link" href="edit">Edit movie list</a>
      </li>
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search movies" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>



      
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="movie2.jpg" alt="First slide">
                
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="movie3.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="movie.jpg" alt="Third slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
  <div class="flex-column align-items-between d-flex">
        <div class="d-flex row justify-content-center">

         <div class="card m-3" id="setwidth">
                <img src="${name1 }.jpg"
                     class="card-img-top"
                     alt="avenger"
                     height="50%" />
                <div class="card-body">
                    <div class="card-title d-flex justify-content-between">
                        <h5>${name1}</h5>
                        <h5 class="text-danger">Rs.${price1}</h5>
                    </div>
                    <div class="card-text d-flex justify-content-between ">
                        <span class="text-black-50">
                            <span class="badge badge-success">${active1}</span>
                            
                        </span>
                        <span class="text-black-50"> Genre:</span>
                        <span class="badge badge-info">${genre1}</span>
                       
                    </div>

                    <div class="d-flex flex-row justify-content-between text-black-50 mt-3">
                        <span class="d-flex flex-column">
                           
                            <small>
                                ${date1}
                            </small>
                        </span>
                        <a href="#"
                           class="btn btn-danger">
                            <i class="fa fa-cart-plus mr-1"></i>${teaser1}
                            
                        </a>
                    </div>
                </div>
    </div>


                <div class="card m-3" id="setwidth">
                        <img src="${name2 }.jpg"
                             class="card-img-top"
                             alt="avenger"
                             height="50%" />
                        <div class="card-body">
                            <div class="card-title d-flex justify-content-between">
                                <h5>${name2}</h5>
                                <h5 class="text-danger">Rs.${price2}</h5>
                            </div>
                            <div class="card-text d-flex justify-content-between ">
                                <span class="text-black-50">
                                    <span class="badge badge-danger">${active2}</span>
                                    
                                </span>
                                <span class="text-black-50"> Genre:</span>
                                <span class="badge badge-info">${genre2}</span>
                               
                            </div>
        
                            <div class="d-flex flex-row justify-content-between text-black-50 mt-3">
                                <span class="d-flex flex-column">
                                   
                                    <small>
                                        ${date2}
                                    </small>
                                </span>
                                  <a href="#"
                           class="btn btn-danger">
                                <i class="fa fa-cart-plus mr-1"></i>${teaser2}</a>
                            </div>
                        </div>

</div>





                        <div class="card m-3" id="setwidth">
                                <img src="${name4 }.jpg"
                                     class="card-img-top"
                                     alt="avenger"
                                     height="50%" />
                                <div class="card-body">
                                    <div class="card-title d-flex justify-content-between">
                                        <h5>${name4}</h5>
                                        <h5 class="text-danger">Rs.${price4}</h5>
                                    </div>
                                    <div class="card-text d-flex justify-content-between ">
                                        <span class="text-black-50">
                                            <span class="badge badge-success">${active4}</span>
                                            
                                        </span>
                                        <span class="text-black-50"> Genre:</span>
                                        <span class="badge badge-info">${genre4}</span>
                                       
                                    </div>
                
                                    <div class="d-flex flex-row justify-content-between text-black-50 mt-3">
                                        <span class="d-flex flex-column">
                                           
                                            <small>
                                              ${date4}
                                            </small>
                                        </span>
                                        <a href="#"
                           class="btn btn-danger">
                            <i class="fa fa-cart-plus mr-1"></i>${teaser4}
                            
                        </a>
                                    </div>
                                </div>
            </div>
            </div>

</div>

<div class="footer">
    <p>Copyright 2019</p>
</div>
</body>
</html>