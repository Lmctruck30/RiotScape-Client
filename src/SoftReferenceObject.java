import java.lang.ref.SoftReference;

final class SoftReferenceObject extends Class3_Sub28_Sub7 {

   private SoftReference<Object> aSoftReference4053;


   final Object method567(boolean var1) {
      if(!var1) {
         this.method567(true);
      }

      return this.aSoftReference4053.get();
   }

   final boolean method568(int var1) {
      if(var1 != -22358) {
         this.aSoftReference4053 = (SoftReference<Object>)null;
      }

      return true;
   }

   SoftReferenceObject(Object var1) {
      this.aSoftReference4053 = new SoftReference<Object>(var1);
   }
}
