package iteso.qaassurance.trianglejava.service;


import org.springframework.stereotype.Service;

@Service
public class TriangleJava {
    private boolean isTriangle(Integer a, Integer b, Integer c) {

        if (a == 0 || b == 0 || c == 0) {
            return false;
        }

        if ((a > (b+c)) || (b > (a + c)) || (c > (a + b))) {
            return false;
        }

        return true;
    }


    public String triangleType(Integer a, Integer b, Integer c) {
        if (!isTriangle(a,b,c)) {
            throw new IllegalArgumentException("NO es un triángulo.");
        }
        String triangleType = "Escaleno";

        if (a==b && b == c) {
            triangleType = "Equilatero";
        } else {
            if ((a == b) || (a == c) || (b == c)) {
                triangleType = "Isóceles";
            }
        }
        return triangleType;
    }
}
