import com.mojang.serialization.Codec;

public class def extends ddt<dge> {
   public def(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      gt $$1 = $$0.e();
      amn $$2 = $$0.d();
      chp $$3 = $$0.b();

      while($$3.x($$1) && $$1.v() > $$3.u_() + 2) {
         $$1 = $$1.c();
      }

      if (!$$3.a_($$1).a(cju.cY)) {
         return false;
      } else {
         $$1 = $$1.b($$2.a(4));
         int $$4 = $$2.a(4) + 7;
         int $$5 = $$4 / 4 + $$2.a(2);
         if ($$5 > 1 && $$2.a(60) == 0) {
            $$1 = $$1.b(10 + $$2.a(30));
         }

         for(int $$6 = 0; $$6 < $$4; ++$$6) {
            float $$7 = (1.0F - (float)$$6 / (float)$$4) * (float)$$5;
            int $$8 = ami.f($$7);

            for(int $$9 = -$$8; $$9 <= $$8; ++$$9) {
               float $$10 = (float)ami.a($$9) - 0.25F;

               for(int $$11 = -$$8; $$11 <= $$8; ++$$11) {
                  float $$12 = (float)ami.a($$11) - 0.25F;
                  if (($$9 == 0 && $$11 == 0 || !($$10 * $$10 + $$12 * $$12 > $$7 * $$7))
                     && ($$9 != -$$8 && $$9 != $$8 && $$11 != -$$8 && $$11 != $$8 || !($$2.i() > 0.75F))) {
                     cvo $$13 = $$3.a_($$1.b($$9, $$6, $$11));
                     if ($$13.h() || b($$13) || $$13.a(cju.cY) || $$13.a(cju.cX)) {
                        this.a($$3, $$1.b($$9, $$6, $$11), cju.hA.m());
                     }

                     if ($$6 != 0 && $$8 > 1) {
                        $$13 = $$3.a_($$1.b($$9, -$$6, $$11));
                        if ($$13.h() || b($$13) || $$13.a(cju.cY) || $$13.a(cju.cX)) {
                           this.a($$3, $$1.b($$9, -$$6, $$11), cju.hA.m());
                        }
                     }
                  }
               }
            }
         }

         int $$14 = $$5 - 1;
         if ($$14 < 0) {
            $$14 = 0;
         } else if ($$14 > 1) {
            $$14 = 1;
         }

         for(int $$15 = -$$14; $$15 <= $$14; ++$$15) {
            for(int $$16 = -$$14; $$16 <= $$14; ++$$16) {
               gt $$17 = $$1.b($$15, -1, $$16);
               int $$18 = 50;
               if (Math.abs($$15) == 1 && Math.abs($$16) == 1) {
                  $$18 = $$2.a(5);
               }

               while($$17.v() > 50) {
                  cvo $$19 = $$3.a_($$17);
                  if (!$$19.h() && !b($$19) && !$$19.a(cju.cY) && !$$19.a(cju.cX) && !$$19.a(cju.hA)) {
                     break;
                  }

                  this.a($$3, $$17, cju.hA.m());
                  $$17 = $$17.c();
                  if (--$$18 <= 0) {
                     $$17 = $$17.c($$2.a(5) + 1);
                     $$18 = $$2.a(5);
                  }
               }
            }
         }

         return true;
      }
   }
}