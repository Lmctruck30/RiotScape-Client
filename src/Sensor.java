import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Sensor {

   private Robot robot = new Robot();
   private Component component;


   public void setCustomCursor(byte var1, Point hotSpot, int width, Component var4, int height, int[] rgbArray) {
      if(var1 > 108) {
         if(rgbArray != null) {
            BufferedImage customCursorImage = new BufferedImage(width, height, 2);
            customCursorImage.setRGB(0, 0, width, height, rgbArray, 0, width);
            var4.setCursor(var4.getToolkit().createCustomCursor(customCursorImage, hotSpot, (String)null));
         } else {
            var4.setCursor((Cursor)null);
         }
      }

   }

   Sensor() throws Exception {}

   public void forceMouseMove(int x, int y) {
      robot.mouseMove(x, y);
   }

   public void method1797(Component var1, int var2, boolean var3) {
      if(!var3) {
         if(var1 == null) {
            throw new NullPointerException();
         }
      } else {
         var1 = null;
      }

      if(var1 != this.component) {
         if(var2 != 1) {
            this.setCustomCursor((byte)-12, (Point)null, -10, (Component)null, -51, (int[])null);
         }

         if(this.component != null) {
            this.component.setCursor((Cursor)null);
            this.component = null;
         }

         if(var1 != null) {
            var1.setCursor(var1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this.component = var1;
         }
      }

   }
}
