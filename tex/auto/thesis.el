(TeX-add-style-hook
 "thesis"
 (lambda ()
   (TeX-add-to-alist 'LaTeX-provided-class-options
                     '(("tulthesis" "FM" "DP")))
   (TeX-add-to-alist 'LaTeX-provided-package-options
                     '(("babel" "czech") ("inputenc" "utf8")))
   (TeX-run-style-hooks
    "latex2e"
    "tulthesis"
    "tulthesis10"
    "babel"
    "inputenc"
    "setspace")))

