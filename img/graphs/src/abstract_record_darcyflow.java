

/**
 *  @navassoc - - "primary_equation  \n " DarcyFlow
 */
class SequentialCoupling {
    
}

abstract class DarcyFlow {}
abstract class Darcy2 {}

class Steady_MH extends DarcyFlow, Darcy2 {}
class Unsteady_MH implements DarcyFlow {}
class Unsteady_LMH implements DarcyFlow {}

