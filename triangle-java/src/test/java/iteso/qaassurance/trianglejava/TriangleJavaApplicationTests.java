package iteso.qaassurance.trianglejava;

import iteso.qaassurance.trianglejava.controller.TriangleJavaController;
import iteso.qaassurance.trianglejava.service.TriangleJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.when;

@SpringBootTest
class TriangleJavaApplicationTests {

	@Autowired
	TriangleJavaController triangleJavaController;

	@MockBean
	TriangleJava triangleJava;

	@Test
	void contextLoads() {
	}

	@Test
	public void TestValidParametersController() throws Exception {

		when(triangleJava.triangleType(3,5,5)).thenReturn("Escaleno");

		String testval = triangleJavaController.triangle(3,4,5);

		Assertions.assertEquals(testval, "Escaleno");
	}

	@Test
	public void Escaleno() throws Exception {

		when(triangleJava.triangleType(1,2,3)).thenReturn("Escaleno");

		String testval = triangleJavaController.triangle(1,2,3);

		Assertions.assertEquals(testval, "Escaleno");
	}

	@Test
	public void Isoceles() throws Exception {

		when(triangleJava.triangleType(2,2,3)).thenReturn("Isóceles");

		String testval = triangleJavaController.triangle(2,2,3);

		Assertions.assertEquals(testval, "Isóceles");
	}

	@Test
	public void Equilatero() throws Exception {

		when(triangleJava.triangleType(3,3,3)).thenReturn("Equilatero");

		String testval = triangleJavaController.triangle(3,3,3);

		Assertions.assertEquals(testval, "Equilatero");
	}

	@Test
	public void TestInvalidParametersController() throws Exception {

		when(triangleJava.triangleType(0,0,0)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(0,0,0);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}

	@Test
	public void ALong() throws Exception {

		when(triangleJava.triangleType(54,1,2)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(54,1,2);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}

	@Test
	public void BLong() throws Exception {

		when(triangleJava.triangleType(1,54,2)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(1,54,2);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}

	@Test
	public void CLong() throws Exception {

		when(triangleJava.triangleType(1,2,54)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(1,2,54);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}

	@Test
	public void AZero() throws Exception {

		when(triangleJava.triangleType(0,1,2)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(0,1,2);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}

	@Test
	public void BZero() throws Exception {

		when(triangleJava.triangleType(1,0,2)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(1,0,2);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}

	@Test
	public void CZero() throws Exception {

		when(triangleJava.triangleType(1,2,0)).thenThrow(new IllegalArgumentException("NO es un triángulo."));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			
			String testval = triangleJavaController.triangle(1,2,0);
		});

		Assertions.assertEquals("NO es un triángulo.", ex.getMessage());
	}
}
