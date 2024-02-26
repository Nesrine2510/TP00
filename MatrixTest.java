import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Matrix;
public class MatrixTest {

    @Test
    public void testSetAndGet() {

        Matrix matrix = new Matrix(3);
        matrix.set(1, 2, 5);
        assertEquals(5, matrix.get(1, 2));
    }

    @Test
    public void testAddMatrices() {

        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(1, 1, 2);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 1, 3);
        matrix2.set(1, 0, 4);

        matrix1.add(matrix2);

        assertEquals(1, matrix1.get(0, 0));
        assertEquals(3, matrix1.get(0, 1));
        assertEquals(4, matrix1.get(1, 0));
        assertEquals(2, matrix1.get(1, 1));
    }

    @Test
    public void testMultiplyMatrices() {

        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(1, 1, 2);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 1, 3);
        matrix2.set(1, 0, 4);

        matrix1.multiply(matrix2);

        assertEquals(4, matrix1.get(0, 0));
        assertEquals(3, matrix1.get(0, 1));
        assertEquals(6, matrix1.get(1, 0));
        assertEquals(8, matrix1.get(1, 1));
    }

    @Test
    public void testTranspose() {

        Matrix matrix = new Matrix(2);
        matrix.set(0, 1, 5);
        matrix.transpose();

        assertEquals(0, matrix.get(0, 1));
        assertEquals(5, matrix.get(1, 0));
    }

    @Test
    public void testToString() {
        // Test de la méthode toString
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(1, 1, 2);

        String expected = "[1, 0]\n[0, 2]\n";
        assertEquals(expected, matrix.toString());
    }
}
