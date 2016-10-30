package Übung3;
/**
 * 
 * @author Justin Sprenger s0556255
 * @author Friedrich Hartung s0556077
 * Gruppenarbeit
 * @date 29.10.2016
 */
public class BitFlags {
	private int status;

	BitFlags(int status) {
		this.status = status;
	}

	public int switchOn(int index) {
		if (index >= 31 && index < 0) {
			throw new IllegalArgumentException("Index muss kleiner als 31 und mindestens 0 sein!");
		} else {
			int bit = 1;
			index = index - 1; // -1, weil der index nicht die anzahl der zu
								// verschiebenen bit enthält, sondern die stelle
								// von rechts nach links gezählte stelle!
			bit = bit << index;
			status = status | bit;
		}
		return status;
	}

	public int switchOff(int index) {
		if (index >= 31 && index < 0) {
			throw new IllegalArgumentException("Index muss kleiner als 31 und mindestens 0 sein!");
		} else {
			int bit = 1;
			index = index - 1; // -1, weil der index nicht die anzahl der zu
								// verschiebenen bit enthält, sondern die stelle
								// von rechts nach links gezählte stelle!
			bit = bit << index;
			status = status & ~bit;
		}
		return status;
	}

	public int swap(int index) {
		if (index >= 31 && index < 0) {
			throw new IllegalArgumentException("Index muss kleiner als 31 und mindestens 0 sein!");
		} else {
			int bit = 1;
			int hilf = 0;
			index = index - 1; // -1, weil der index nicht die anzahl der zu
								// verschiebenen bit enthält, sondern die stelle
								// von rechts nach links gezählte stelle!
			bit = bit << index;
			hilf = status << (30 - index);
			hilf = hilf >>> (31);
			if (status > 0) {
				if (hilf == 0) {
					status = status | bit;
				} else {
					status = status & ~bit;
				}
			} else {
				if (hilf != 0) {
					status = status | bit;
				} else {
					status = status & ~bit;
				}
			}
		}
		return status;
	}

	public boolean isSet(int index) {
		boolean set = false;
		if (index >= 31 && index < 0) {
			throw new IllegalArgumentException("Index muss kleiner als 31 und mindestens 0 sein!");
		} else {
			int bit = 1;
			int hilf = 0;
			index = index - 1; // -1, weil der index nicht die anzahl der zu
								// verschiebenen bit enthält, sondern die stelle
								// von rechts nach links gezählte stelle!
			bit = bit << index;
			hilf = status << (30 - index);
			hilf = hilf >>> (31);
			if (status > 0) {
				if (hilf != 0) {
					set = true;
				} else {
					set = false;
				}
			} else {
				if (hilf == 0) {
					set = true;
				} else {
					set = false;
				}
			}
		}
		return set;
	}
}
