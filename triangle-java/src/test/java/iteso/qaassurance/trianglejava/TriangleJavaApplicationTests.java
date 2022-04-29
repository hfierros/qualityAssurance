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

		when(triangleJava.triangleType(1,2,3)).thenReturn("Escaleno");

		String testval = triangleJavaController.triangle(1,2,3);

		Assertions.assertEquals(testval, "Escaleno");
	}

	@Test
	public void TestInvalidParametersController() throws Exception {
		when(triangleJava.triangleType(0,0,0)).thenThrow(new IllegalArgumentException("Mock exception"));
		IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			String testVal = triangleJavaController.triangle(0, 0,0);
		});

		Assertions.assertEquals("Mock exception", ex.getMessage());


	}
}
