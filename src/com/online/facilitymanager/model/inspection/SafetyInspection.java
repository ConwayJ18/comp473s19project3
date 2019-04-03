public class FireInspection extends Inspection
{
    public SafetyInspection(InspectionType type, Slot slot)
    {
      public SafetyInspection() {
        super();
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public SafetyInspection(InspectionType inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public String getInspectionType()
      {
        return "Safety";
      }

      /**
       * @param inspectionType the inspectionType to set
       */
      public void inspectionType(InspectionType inspectionType)
      {
        this.inspectionType = inspectionType;
      }

      /**
       * @return the slot
       */
      public Slot getSlot()
      {
        return slot;
      }

      /**
       * @param slot the slot to set
       */
      public void setSlot(Slot slot)
      {
        this.slot = slot;
      }
    }
}