public class wm implements tc<tf> {
   private final float a;
   private final int b;
   private final int c;

   public wm(float $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public wm(qx $$0) {
      this.a = $$0.readFloat();
      this.c = $$0.k();
      this.b = $$0.k();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeFloat(this.a);
      $$0.d(this.c);
      $$0.d(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }
}
