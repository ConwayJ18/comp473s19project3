public class Inspection
{
  protected InspectionType inspectionType;
	private Slot slot;

	public Inspection() {}

  /**
	 * @param inspectionType
	 * @param slot
	 */
	public Inspection(InspectionType inspectionType, Slot slot)
	{
		this.inspectionType = inspectionType;
		this.slot = slot;
	}

  /**
   * @return the inspectionType
   */
  abstract public String getInspectionType();

  /**
   * @param inspectionType the inspectionType to set
   */
  abstract public void inspectionType(InspectionType inspectionType);

  /**
   * @return the stringType
   */
  abstract public String getStringType();

  /**
   * @param stringType the stringType to set
   */
  abstract public void setStringType(String stringType);

  /**
   * @return the slot
   */
  abstract public Slot getSlot();

  /**
   * @param slot the slot to set
   */
  abstract public void setSlot(Slot slot);
}
