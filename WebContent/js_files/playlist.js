$(document).ready(function(){
	var listTracks = document.getElementsByClassName("ltrack");
	var current = 0;
	var audio = document.getElementById("audio");
	var tracks = document.getElementsByClassName("track");
	audio.volume = .10;
	audio.play();
	var i;
	for (i = 0; i < tracks.length ; i++) {
		tracks[i].innerHTML = "<a class=\"track\" href=\"${audio}\">" + getName(tracks[i].href) + "</a>";
	    tracks[i].addEventListener("click", 
	        function (event) {
	            event.preventDefault();
	            link = this.href;
	            current = i;
	            run(link, audio, i);
	        }, 
	        false);
	}
	
	audio.addEventListener('ended',function(e){
	    current++;
	    if(current == len){
	        current = 0;
	        link = tracks[0];
	    }else{
	        link = tracks[current];    
	    }
	    run(link, audio, current);
	});
});

function run(link, player, index){
        player.src = link;
        for(var j=0; j<listTracks.length;j++){
        	listTracks[j].classList.remove("active");
        }
        listTracks[index].className = "active";
        player.load();
        player.play();
}

function getName(audioPath){
	var res = audioPath.split("/");
	return res[res.length-1];
}
