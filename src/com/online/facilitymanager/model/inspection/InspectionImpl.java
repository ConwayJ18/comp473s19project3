package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public class InspectionImpl extends Inspection
{
	private InspectionType inspectionType;
	private Slot slot;

	public InspectionImpl() {}

	/**
	 * @param inspectionType
	 * @param slot
	 */
	public InspectionImpl(InspectionType inspectionType, Slot slot)
	{
		this.inspectionType = inspectionType;
		this.slot = slot;
	}

	/**
	 * @return the inspectionType
	 */
	@Override
	public InspectionType getInspectionType()
	{
		return this.inspectionType;
	}

	/**
	 * @param inspectionType the inspectionType to set
	 */
	@Override
	public void setInspectionType(InspectionType inspectionType)
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
