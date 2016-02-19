GRAPH_FILES := $(basename $(notdir $(wildcard src/*.java)))

all:
	make $(GRAPH_FILES)

%:
	umlgraph src/$@ svg -bgcolor white -attributes -types
	mv src/$@.svg svg/$@.svg
	inkscape -D -z --file=svg/$@.svg --export-pdf=$@.pdf
