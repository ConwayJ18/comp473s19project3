public class FireInspection extends Inspection
{
    public FireInspection(InspectionType type, Slot slot)
    {
      public FireInspection() {
        super();
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public FireInspection(InspectionType inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public String getInspectionType()
      {
        return "Fire";
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
