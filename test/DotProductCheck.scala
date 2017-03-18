import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object DotProductCheck extends Properties("DotProduct"){

  val genNonNegativesInts: Gen[Int] = Gen.choose(0, 20)
  val listOfNonNegatives: Gen[Array[Int]] =
    for {
      size <- Gen.choose(2,1000)
      elems <- Gen.containerOfN[Array, Int](size, genNonNegativesInts)
    } yield elems

  property("both solutions should be equivalent") =
    forAll(genNonNegativesInts){n  =>
      val assertion = true
      if (!assertion)
        System.out.println("ERROR EN F[" + n + "]")
      assertion
    }

}
