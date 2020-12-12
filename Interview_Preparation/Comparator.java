class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        if (a.score == b.score) {
            if (a.name.equals(b.name)) return 0;
            if (a.name.compareTo(b.name) < 0) {
                return -1;
            } else {
                return 1;
            }

        } else {
            return (a.score > b.score ? -1 : 1);
        }
    
    }
}

