package snail.oswald.eckel.chapter10;

import snail.oswald.eckel.chapter10.testParcel.Contents;

public class Parcel7 {
    public Contents contents() {
        return new Contents() { // Insert a class definition
            private int i = 11;
            public int value() {
                return i;
            }
        }; // Semicolon required in this case
    }
}

/* equivalent of:
* public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	public Contents contents() {
		return new MyContents();
	}
}
* */