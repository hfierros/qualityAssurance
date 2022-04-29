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

		when(triangleJava.triangleType(1, 2, 3)).thenReturn("Escaleno");

		String testval = triangleJavaController.triangle(1, 2, 3);

		Assertions.assertEquals(testval, "Escaleno");
	}

	@Test
	public void TestValidParametersController1() throws Exception {

		when(triangleJava.triangleType(3, 2, 1)).thenReturn("Escaleno");

		String testval = triangleJavaController.triangle(3, 2, 1);

		Assertions.assertEquals(testval, "Escaleno");
	}

	@Test
	public void TestValidParametersController2() throws Exception {

		when(triangleJava.triangleType(3, 3, 3)).thenReturn("Equilatero");

		String testval = triangleJavaController.triangle(3, 3, 3);

		Assertions.assertEquals(testval, "Equilatero");
	}

	@Test
	public void TestValidParametersController3() throws Exception {

		when(triangleJava.triangleType(3, 4, 3)).thenReturn("Isóceles");

		String testval = triangleJavaController.triangle(3, 4, 3);

		Assertions.assertEquals(testval, "Isóceles");
	}

	@Test
	public void TestValidParametersController4() throws Exception {

		when(triangleJava.triangleType(4, 4, 5)).thenReturn("Isóceles");

		String testval = triangleJavaController.triangle(4, 4, 5);

		Assertions.assertEquals(testval, "Isóceles");
	}

	@Test
	public void TestValidParametersController5() throws Exception {

		when(triangleJava.triangleType(5, 4, 4)).thenReturn("Isóceles");

		String testval = triangleJavaController.triangle(5, 4, 4);

		Assertions.assertEquals(testval, "Isóceles");
	}

	@Test
	public void TestValidParametersController6() throws Exception {

		when(triangleJava.triangleType(0, 4, 4)).thenReturn("NO es un triángulo.");

		String testval = triangleJavaController.triangle(0, 4, 4);

		Assertions.assertEquals(testval, "NO es un triángulo.");
	}

	@Test
	public void TestValidParametersController7() throws Exception {

		when(triangleJava.triangleType(5, -4, 4)).thenReturn("NO es un triángulo.");

		String testval = triangleJavaController.triangle(5, -4, 4);

		Assertions.assertEquals(testval, "NO es un triángulo.");
	}

	@Test
	public void TestValidParametersController8() throws Exception {

		when(triangleJava.triangleType(5, 4, 0)).thenReturn("NO es un triángulo.");

		String testval = triangleJavaController.triangle(5, 4, 0);

		Assertions.assertEquals(testval, "NO es un triángulo.");
	}

	@Test
	public void TestInvalidParametersController() throws Exception {
		when(triangleJava.triangleType(0, 0, 0)).thenThrow(new IllegalArgumentException("Mock exception"));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			String testVal = triangleJavaController.triangle(0, 0, 0);
		});

		Assertions.assertEquals("Mock exception", ex.getMessage());

	}
}
