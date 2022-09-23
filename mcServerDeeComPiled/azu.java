import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class azu extends azo {
   public static final Codec<azu> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.f))
               .apply($$0, azu::new)
      )
      .comapFlatMap(
         $$0 -> $$0.f < $$0.b ? DataResult.error("Max must be at least min, min_inclusive: " + $$0.b + ", max_inclusive: " + $$0.f) : DataResult.success($$0),
         Function.identity()
      );
   private final int b;
   private final int f;

   private azu(int $$0, int $$1) {
      this.b = $$0;
      this.f = $$1;
   }

   public static azu a(int $$0, int $$1) {
      return new azu($$0, $$1);
   }

   @Override
   public int a(amn $$0) {
      return ami.b($$0, this.b, this.f);
   }

   @Override
   public int a() {
      return this.b;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public azp<?> c() {
      return azp.b;
   }

   public String toString() {
      return "[" + this.b + "-" + this.f + "]";
   }
}
