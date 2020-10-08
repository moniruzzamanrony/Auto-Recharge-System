/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Color;
import java.io.IOException;
import net.sourceforge.barbecue.output.LabelLayout;
import net.sourceforge.barbecue.output.Output;
import net.sourceforge.barbecue.output.OutputException;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;



public class PDFBoxOutput implements Output {

   
    public final static float SCALAR = 0.5f;

    private final PDPageContentStream stream;
    private final float startX;
    private final float startY;
    private final float height;
    private boolean toggleDrawingColor;

    PDFBoxOutput(PDPageContentStream stream, float startX, float startY, float height) {
        this.stream = stream;
        this.startX = startX;
        this.startY = startY;
        this.height = height;
    }

    @Override
    public void beginDraw() throws OutputException {}

    @Override
    public int drawBar(int x, int y, int width, int height, boolean paintWithForegroundColor) throws OutputException {
        if (paintWithForegroundColor == !toggleDrawingColor) {
            try {
                stream.setLineWidth(0.0f);
                stream.setStrokingColor(Color.BLACK);
                stream.fillRect(startX + SCALAR * x, startY - SCALAR * y, SCALAR * width, this.height);
//                stream.stroke();
            } catch (IOException e) {
                throw new OutputException(e);
            }
        }
        return width;
    }

    @Override
    public int drawText(String text, LabelLayout layout) throws OutputException {
        return 0;
    }

    @Override
    public void endDraw(int width, int height) throws OutputException {}

    @Override
    public void paintBackground(int x, int y, int width, int height) {}

    @Override
    public void toggleDrawingColor() {
        toggleDrawingColor = !toggleDrawingColor;
    }

}