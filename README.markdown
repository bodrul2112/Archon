
Archon
====

Its early days but I want to build a something that will help with quick scaffolding around web projects using require.js

The main idea is to have a gui for all of this, there are a fair few examples of code out there already that do this kind of thing, via guis or command line, and the preferance for coders seem to be the command line. But for the gui-sick I present Archon.

The Idea is to be working in you're IDE, after you make changes you will be notified, your web project will be served via jetty so you can immediately see the changes.

In the near future I'd like to add controls over the deployment, optimisation and etc. For now I'll be concentrating on the scaffolding.

For the time being the current functionality I'm aiming for are:

- Scaffolding
	- Bare Minimum
	- Popular Bootstraps
	- Add popular libraries
	- Add custom located libraries

	
- FileWatchers
	- be notified when files have changed
	- select aggressiveness of notifications
	- serve from notification
	- select aggressiveness of deployment (deploy at interval, deploy with every change, manual deploy)

	
- Keybindings
	- Hide and show the GUI via a keybinding

	
- Dependecy Graphs
	- because why not