class EditOptions implements Editable {
    CirSim sim;
    public EditOptions(CirSim s) { sim = s; }
    public EditInfo getEditInfo(int n) {
	if (n == 0)
	    return new EditInfo("Unidade por tempo (s)", sim.timeStep, 0, 0);
	if (n == 1)
	    return new EditInfo("Faixa para cor de tensão (V)",
				CircuitElm.voltageRange, 0, 0);
	    
	return null;
    }
    public void setEditValue(int n, EditInfo ei) {
	if (n == 0 && ei.value > 0)
	    sim.timeStep = ei.value;
	if (n == 1 && ei.value > 0)
	    CircuitElm.voltageRange = ei.value;
    }
};
