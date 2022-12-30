<%@ page contentType="text/html" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Buscar por ID</title>
    <link rel="icon"
        href="https://images.vexels.com/media/users/3/200097/isolated/preview/942820836246f08c2d6be20a45a84139-icono-de-carrito-de-compras-carrito-de-compras.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg shadow">
            <div class="container-fluid">
                <div class="d-flex align-items-center gap-3">
                    <a class="navbar-brand" href="#">
                        <img src="https://images.vexels.com/media/users/3/200097/isolated/preview/942820836246f08c2d6be20a45a84139-icono-de-carrito-de-compras-carrito-de-compras.png" alt="imagen de carrito" style="width: 2rem;">
                    </a>
                    <h2 class="m-0 .titulo">Doña Sonia</h2>
                </div>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto ms-3 mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active text-white-50" aria-current="page" href="index.html">Agregar Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" href="buscarId.jsp">Buscar por ID</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main class="container d-flex justify-content-between gap-2 mt-2">
        <div class="col-4 h-100 d-flex align-self-center">
            <img src="https://play-lh.googleusercontent.com/WL9oSrJxfO6XDrSnuERVcjFXN--XztDibPGtAxIJsJBfm2ZAv4WvkR5yFuOcFKKR0_A" alt="" style="width:100%">
        </div>
        <section class="col-4 align-self-center">
            <div class="d-flex justify-content-center align-items-center p-2">
                <h2 class="m-0 text-white">Buscar por ID</h2>
            </div>
            <form action="vercliente" method="get" class="p-3 rounded-2">
                <div class="form-floating mb-3">
                    <input type="text" name="id" class="form-control" id="floatingInput">
                    <label for="floatingInput" class="text-black">ID Cliente</label>
                </div>
                <input class="btn btn-success" type="submit" value="Ver"/>
            </form>
        </section>
        <div class="col-4 h-100 d-flex align-self-center">
            <img src="https://play-lh.googleusercontent.com/WL9oSrJxfO6XDrSnuERVcjFXN--XztDibPGtAxIJsJBfm2ZAv4WvkR5yFuOcFKKR0_A" alt="" style="width: 100%;">
        </div>
    </main>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>