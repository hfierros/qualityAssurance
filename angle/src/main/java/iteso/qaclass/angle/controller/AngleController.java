package iteso.qaclass.angle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AngleController {
    @RequestMapping("/")
    public String alive() {
        return "Alive!";
    }

    private String getAngleType(int x, int y) {
        if (x==0 && y==0) {
            return "Invalido: Punto de origen";
        }

        if (y < 0) {
            return "Invalido: No en el plano superior";
        }

        if (x==0) {
            return "Recto";
        }

        if (y > 0) {
            return "Agudo";
        }

        return "Obtuso";
    }

    @RequestMapping("/angle")
    public String angle(@RequestParam("x") int x,
                        @RequestParam("y") int y) {
        String angleType = getAngleType(x,y);
        return angleType;
    }
}

