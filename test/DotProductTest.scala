import org.scalatest.FlatSpec

class DotProductTest extends FlatSpec {

  behavior of "DotProduct"

  it should "compute maximum revenue for a case" in {
    assert(DotProduct.maxDotProduct(Array(23),Array(39)) === 897)
  }

  it should "compute maximum revenue for b case" in {
    assert(DotProduct.maxDotProduct(Array(1,3,-5),Array(-2,4,1)) === 23)
  }

}
