# set latexfile to the name of the main file without the .tex
latexfile = thesis

pdf : vlna
	pdflatex $(latexfile).tex
	pdflatex $(latexfile).tex
	pdflatex $(latexfile).tex

vlna:
	vlna $(latexfile).tex
