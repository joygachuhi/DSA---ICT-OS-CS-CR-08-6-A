package LinkedList.java;

public class playlist {
	songNode head;
	playlist(){
		this.head = null;
	}
	void addsong(song song) {
		songNode newNode = new songNode(song);
		if(head == null) {
			head = newNode;
			return;
		}
		songNode temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	void playAll() {
		songNode current = head;
		while(current !=null) {
			playsong(current.song);
			current = current.next;
		}
		System.out.println("Enf of playlist");
	}
	
	void playsong(song song) {
		System.out.println("playing:" + song.title + "artist:" + song.artist + "duration:" + song.duration);
		try {
			Thread.sleep(song.duration * 1000L);
		}
		catch(InterruptedException e) {
			System.out.println("play here Interrupted");
			
		}
		
	}

}
