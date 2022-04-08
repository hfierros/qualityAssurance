
var express = require('express');
var router = express.Router();

function getTriangleType(a, b, c) {
    console.log(a,b,c)
    if (!Number.isInteger(a)
        || !Number.isInteger(b) || !Number.isInteger(c)) {
            throw new Error("Invalid params")
        }

    if ((a > (b+c)) || (b > (a +c)) || (c > (a+b)))
        throw new Error("Not a triangle")
  
    let tipoTriangulo = "Escaleno"
    if ((a == b) && (b ==c) )
      tipoTriangulo = "Equilatero"
    else 
        if ((a =b) || (a ==c) || (b==c))
          tipoTriangulo = "Isoceles"
    return tipoTriangulo

}

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});


router.get('/triangle', function(req, res, next) {
  var a = parseInt(req.query.a);
  var b = parseInt(req.query.b);
  var c = parseInt(req.query.c);

  var triangleTypeStr = getTriangleType(a,b,c);
  
  res.send(triangleTypeStr)

}); 

module.exports = router;
