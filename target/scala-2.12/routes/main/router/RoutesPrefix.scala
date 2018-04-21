
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_Aa/Now/TECHCENTER-master/conf/routes
// @DATE:Sat Apr 21 12:23:39 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
