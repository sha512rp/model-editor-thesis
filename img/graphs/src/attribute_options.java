

class SorptionData {}

class ReactionTerm {}


/**
 *  @navassoc - - "   reaction_liquid\n0..1" ReactionTerm
 *  @navassoc - - "   input_fields\n0..* " SorptionData
 */
class SorptionMobile {
	double solvent_density;
    string substances[];
    ReactionTerm reaction_liquid;
    SorptionData input_fields[];
}