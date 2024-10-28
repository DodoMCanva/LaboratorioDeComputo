package utilerias;
import Persistencias.ReporteDAO;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/generar-reporte")
public class GenerarReporteServlet extends HttpServlet {
    private final ReporteDAO reporteComputadorasRepository = new ReporteDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Object[]> resultados = reporteComputadorasRepository.obtenerReporteComputadoras();

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=\"reporte_computadoras.pdf\"");

        try (PdfWriter writer = new PdfWriter(response.getOutputStream());
             PdfDocument pdf = new PdfDocument(writer);
             Document document = new Document(pdf)) {

            document.add(new Paragraph("Reporte de Computadoras"));
            Table table = new Table(5);
            table.addHeaderCell("Nombre del Centro");
            table.addHeaderCell("Número de PC");
            table.addHeaderCell("Cantidad de Alumnos");
            table.addHeaderCell("Minutos de Uso");
            table.addHeaderCell("Minutos Inactivos");

            for (Object[] resultado : resultados) {
                table.addCell(resultado[0].toString()); // Nombre del Centro
                table.addCell(resultado[1].toString()); // Número de PC
                table.addCell(resultado[2].toString()); // Cantidad de Alumnos
                table.addCell(resultado[3].toString()); // Minutos de Uso
                table.addCell(resultado[4].toString()); // Minutos Inactivos
            }

            document.add(table);
        }
    }
}
