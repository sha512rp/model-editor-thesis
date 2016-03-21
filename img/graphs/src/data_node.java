
abstract class DataNode {}

/**
 *  @navassoc - - "children" DataNode
 */
abstract class CompositeDataNode extends DataNode
{
}

class MappingDataNode extends CompositeDataNode {}
class SequenceDataNode extends CompositeDataNode {}
class ScalarDataNode extends DataNode {}


