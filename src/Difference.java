class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] input) {
		this.elements = input;
		maximumDifference = 0;
	}

	public int computeDifference() {
		for (int i = 0; i < elements.length - 1; ++i) {
			for (int j = 0; j < elements.length; ++j) {
				if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
					maximumDifference = Math.abs(elements[i] - elements[j]);
				}
			}
		}
		return maximumDifference;
	}
}