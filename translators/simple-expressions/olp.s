	.file	"olp.cpp"
	.section	.text._ZnwmPv,"axG",@progbits,_ZnwmPv,comdat
	.weak	_ZnwmPv
	.type	_ZnwmPv, @function
_ZnwmPv:
.LFB312:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE312:
	.size	_ZnwmPv, .-_ZnwmPv
	.section	.text._ZdlPvS_,"axG",@progbits,_ZdlPvS_,comdat
	.weak	_ZdlPvS_
	.type	_ZdlPvS_, @function
_ZdlPvS_:
.LFB314:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE314:
	.size	_ZdlPvS_, .-_ZdlPvS_
	.local	_ZStL8__ioinit
	.comm	_ZStL8__ioinit,1,1
	.globl	symbols
	.bss
	.align 16
	.type	symbols, @object
	.size	symbols, 24
symbols:
	.zero	24
	.section	.text._ZN6SymbolC2ERKS_,"axG",@progbits,_ZN6SymbolC5ERKS_,comdat
	.align 2
	.weak	_ZN6SymbolC2ERKS_
	.type	_ZN6SymbolC2ERKS_, @function
_ZN6SymbolC2ERKS_:
.LFB1290:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rax
	movl	(%rax), %edx
	movq	-8(%rbp), %rax
	movl	%edx, (%rax)
	movq	-16(%rbp), %rax
	movl	4(%rax), %edx
	movq	-8(%rbp), %rax
	movl	%edx, 4(%rax)
	movq	-16(%rbp), %rax
	leaq	8(%rax), %rdx
	movq	-8(%rbp), %rax
	addq	$8, %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1ERKS4_
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1290:
	.size	_ZN6SymbolC2ERKS_, .-_ZN6SymbolC2ERKS_
	.weak	_ZN6SymbolC1ERKS_
	.set	_ZN6SymbolC1ERKS_,_ZN6SymbolC2ERKS_
	.section	.text._ZN6SymbolD2Ev,"axG",@progbits,_ZN6SymbolD5Ev,comdat
	.align 2
	.weak	_ZN6SymbolD2Ev
	.type	_ZN6SymbolD2Ev, @function
_ZN6SymbolD2Ev:
.LFB1293:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	addq	$8, %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1293:
	.size	_ZN6SymbolD2Ev, .-_ZN6SymbolD2Ev
	.weak	_ZN6SymbolD1Ev
	.set	_ZN6SymbolD1Ev,_ZN6SymbolD2Ev
	.section	.text._ZN6SymbolaSERKS_,"axG",@progbits,_ZN6SymbolaSERKS_,comdat
	.align 2
	.weak	_ZN6SymbolaSERKS_
	.type	_ZN6SymbolaSERKS_, @function
_ZN6SymbolaSERKS_:
.LFB1295:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rax
	movl	(%rax), %edx
	movq	-8(%rbp), %rax
	movl	%edx, (%rax)
	movq	-16(%rbp), %rax
	movl	4(%rax), %edx
	movq	-8(%rbp), %rax
	movl	%edx, 4(%rax)
	movq	-16(%rbp), %rax
	leaq	8(%rax), %rdx
	movq	-8(%rbp), %rax
	addq	$8, %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEaSERKS4_
	movq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1295:
	.size	_ZN6SymbolaSERKS_, .-_ZN6SymbolaSERKS_
	.text
	.globl	_Z10add_symbol6Symbol
	.type	_Z10add_symbol6Symbol, @function
_Z10add_symbol6Symbol:
.LFB1288:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1288
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r12
	pushq	%rbx
	subq	$80, %rsp
	.cfi_offset 12, -24
	.cfi_offset 3, -32
	movq	%rdi, -88(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	$0, -68(%rbp)
.L14:
	movl	-68(%rbp), %eax
	movslq	%eax, %r12
	movl	$symbols, %edi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	cmpq	%rax, %r12
	setb	%al
	testb	%al, %al
	je	.L9
	movl	-68(%rbp), %eax
	cltq
	movq	%rax, %rsi
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EEixEm
	movq	%rax, %rdx
	leaq	-64(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB0:
	call	_ZN6SymbolC1ERKS_
.LEHE0:
	movq	-88(%rbp), %rax
	leaq	8(%rax), %rdx
	leaq	-64(%rbp), %rax
	addq	$8, %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB1:
	call	_ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7compareERKS4_
	testl	%eax, %eax
	sete	%al
	testb	%al, %al
	je	.L10
	movl	-68(%rbp), %eax
	cltq
	movq	%rax, %rsi
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EEixEm
	movq	%rax, %rdx
	movq	-88(%rbp), %rax
	movq	%rax, %rsi
	movq	%rdx, %rdi
	call	_ZN6SymbolaSERKS_
.LEHE1:
	movl	-68(%rbp), %ebx
	movl	$0, %r12d
	jmp	.L11
.L10:
	movl	$1, %r12d
.L11:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB2:
	call	_ZN6SymbolD1Ev
	cmpl	$1, %r12d
	jne	.L15
	nop
	addl	$1, -68(%rbp)
	jmp	.L14
.L9:
	movq	-88(%rbp), %rax
	movq	%rax, %rsi
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_
.LEHE2:
	movl	$symbols, %edi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	subl	$1, %eax
	movl	%eax, %ebx
.L15:
	movl	%ebx, %eax
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L17
	jmp	.L20
.L18:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB3:
	call	_Unwind_Resume
.LEHE3:
.L20:
	call	__stack_chk_fail
.L17:
	addq	$80, %rsp
	popq	%rbx
	popq	%r12
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1288:
	.globl	__gxx_personality_v0
	.section	.gcc_except_table,"a",@progbits
.LLSDA1288:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1288-.LLSDACSB1288
.LLSDACSB1288:
	.uleb128 .LEHB0-.LFB1288
	.uleb128 .LEHE0-.LEHB0
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB1-.LFB1288
	.uleb128 .LEHE1-.LEHB1
	.uleb128 .L18-.LFB1288
	.uleb128 0
	.uleb128 .LEHB2-.LFB1288
	.uleb128 .LEHE2-.LEHB2
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB3-.LFB1288
	.uleb128 .LEHE3-.LEHB3
	.uleb128 0
	.uleb128 0
.LLSDACSE1288:
	.text
	.size	_Z10add_symbol6Symbol, .-_Z10add_symbol6Symbol
	.section	.text._ZN6SymbolC2Ev,"axG",@progbits,_ZN6SymbolC5Ev,comdat
	.align 2
	.weak	_ZN6SymbolC2Ev
	.type	_ZN6SymbolC2Ev, @function
_ZN6SymbolC2Ev:
.LFB1298:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	addq	$8, %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1298:
	.size	_ZN6SymbolC2Ev, .-_ZN6SymbolC2Ev
	.weak	_ZN6SymbolC1Ev
	.set	_ZN6SymbolC1Ev,_ZN6SymbolC2Ev
	.text
	.globl	_Z10get_symboli
	.type	_Z10get_symboli, @function
_Z10get_symboli:
.LFB1296:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1296
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$72, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -72(%rbp)
	movl	%esi, -76(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	-76(%rbp), %eax
	movslq	%eax, %rbx
	movl	$symbols, %edi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	je	.L23
	movl	-76(%rbp), %eax
	cltq
	movq	%rax, %rsi
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EEixEm
	movq	%rax, %rdx
	movq	-72(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB4:
	call	_ZN6SymbolC1ERKS_
	jmp	.L22
.L23:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolC1Ev
.LEHE4:
	movl	$-2, -64(%rbp)
	leaq	-64(%rbp), %rdx
	movq	-72(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB5:
	call	_ZN6SymbolC1ERKS_
.LEHE5:
	nop
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB6:
	call	_ZN6SymbolD1Ev
.LEHE6:
	jmp	.L22
.L28:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB7:
	call	_Unwind_Resume
.LEHE7:
.L22:
	movq	-72(%rbp), %rax
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L27
	call	__stack_chk_fail
.L27:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1296:
	.section	.gcc_except_table
.LLSDA1296:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1296-.LLSDACSB1296
.LLSDACSB1296:
	.uleb128 .LEHB4-.LFB1296
	.uleb128 .LEHE4-.LEHB4
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB5-.LFB1296
	.uleb128 .LEHE5-.LEHB5
	.uleb128 .L28-.LFB1296
	.uleb128 0
	.uleb128 .LEHB6-.LFB1296
	.uleb128 .LEHE6-.LEHB6
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB7-.LFB1296
	.uleb128 .LEHE7-.LEHB7
	.uleb128 0
	.uleb128 0
.LLSDACSE1296:
	.text
	.size	_Z10get_symboli, .-_Z10get_symboli
	.globl	_Z13update_symbolii
	.type	_Z13update_symbolii, @function
_Z13update_symbolii:
.LFB1300:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 3, -24
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movl	-20(%rbp), %eax
	movslq	%eax, %rbx
	movl	$symbols, %edi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	cmpq	%rax, %rbx
	seta	%al
	testb	%al, %al
	je	.L30
	movl	$0, %eax
	jmp	.L31
.L30:
	movl	-20(%rbp), %eax
	cltq
	movq	%rax, %rsi
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EEixEm
	movq	%rax, %rdx
	movl	-24(%rbp), %eax
	movl	%eax, 4(%rdx)
	movl	$1, %eax
.L31:
	addq	$24, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1300:
	.size	_Z13update_symbolii, .-_Z13update_symbolii
	.section	.rodata
.LC0:
	.string	"#"
.LC1:
	.string	" : "
	.text
	.globl	_Z18print_symbol_tablev
	.type	_Z18print_symbol_tablev, @function
_Z18print_symbol_tablev:
.LFB1301:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1301
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r12
	pushq	%rbx
	subq	$64, %rsp
	.cfi_offset 12, -24
	.cfi_offset 3, -32
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	$0, -68(%rbp)
.L34:
	movl	-68(%rbp), %eax
	movslq	%eax, %rbx
	movl	$symbols, %edi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	je	.L38
	movl	-68(%rbp), %eax
	cltq
	movq	%rax, %rsi
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EEixEm
	movq	%rax, %rdx
	leaq	-64(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB8:
	call	_ZN6SymbolC1ERKS_
.LEHE8:
	movl	-60(%rbp), %ebx
	movl	-64(%rbp), %r12d
	movl	$.LC0, %esi
	movl	$_ZSt4cout, %edi
.LEHB9:
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movq	%rax, %rdx
	movl	-68(%rbp), %eax
	movl	%eax, %esi
	movq	%rdx, %rdi
	call	_ZNSolsEi
	movl	$.LC1, %esi
	movq	%rax, %rdi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%r12d, %esi
	movq	%rax, %rdi
	call	_ZNSolsEi
	movl	$.LC1, %esi
	movq	%rax, %rdi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, %esi
	movq	%rax, %rdi
	call	_ZNSolsEi
	movl	$.LC1, %esi
	movq	%rax, %rdi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movq	%rax, %rdx
	leaq	-64(%rbp), %rax
	addq	$8, %rax
	movq	%rax, %rsi
	movq	%rdx, %rdi
	call	_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKNSt7__cxx1112basic_stringIS4_S5_T1_EE
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, %esi
	movq	%rax, %rdi
	call	_ZNSolsEPFRSoS_E
.LEHE9:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB10:
	call	_ZN6SymbolD1Ev
.LEHE10:
	addl	$1, -68(%rbp)
	jmp	.L34
.L37:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB11:
	call	_Unwind_Resume
.LEHE11:
.L38:
	nop
	movq	-24(%rbp), %rax
	xorq	%fs:40, %rax
	je	.L36
	call	__stack_chk_fail
.L36:
	addq	$64, %rsp
	popq	%rbx
	popq	%r12
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1301:
	.section	.gcc_except_table
.LLSDA1301:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1301-.LLSDACSB1301
.LLSDACSB1301:
	.uleb128 .LEHB8-.LFB1301
	.uleb128 .LEHE8-.LEHB8
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB9-.LFB1301
	.uleb128 .LEHE9-.LEHB9
	.uleb128 .L37-.LFB1301
	.uleb128 0
	.uleb128 .LEHB10-.LFB1301
	.uleb128 .LEHE10-.LEHB10
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB11-.LFB1301
	.uleb128 .LEHE11-.LEHB11
	.uleb128 0
	.uleb128 0
.LLSDACSE1301:
	.text
	.size	_Z18print_symbol_tablev, .-_Z18print_symbol_tablev
	.globl	line
	.data
	.align 4
	.type	line, @object
	.size	line, 4
line:
	.long	1
	.globl	peek
	.type	peek, @object
	.size	peek, 1
peek:
	.byte	32
	.globl	_Z5inputB5cxx11
	.bss
	.align 32
	.type	_Z5inputB5cxx11, @object
	.size	_Z5inputB5cxx11, 32
_Z5inputB5cxx11:
	.zero	32
	.globl	input_pos
	.data
	.align 4
	.type	input_pos, @object
	.size	input_pos, 4
input_pos:
	.long	-1
	.globl	char_pos
	.align 4
	.type	char_pos, @object
	.size	char_pos, 4
char_pos:
	.long	-1
	.text
	.globl	_Z9next_charv
	.type	_Z9next_charv, @function
_Z9next_charv:
.LFB1366:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 3, -24
	movl	input_pos(%rip), %eax
	addl	$1, %eax
	movl	%eax, input_pos(%rip)
	movl	char_pos(%rip), %eax
	addl	$1, %eax
	movl	%eax, char_pos(%rip)
	movb	$0, -17(%rbp)
	movl	input_pos(%rip), %eax
	movslq	%eax, %rbx
	movl	$_Z5inputB5cxx11, %edi
	call	_ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE6lengthEv
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	je	.L40
	movl	input_pos(%rip), %eax
	cltq
	movq	%rax, %rsi
	movl	$_Z5inputB5cxx11, %edi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEixEm
	movzbl	(%rax), %eax
	movb	%al, -17(%rbp)
.L40:
	movzbl	-17(%rbp), %eax
	addq	$24, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1366:
	.size	_Z9next_charv, .-_Z9next_charv
	.section	.rodata
.LC2:
	.string	"$"
.LC3:
	.string	"print"
	.text
	.globl	_Z10next_tokenv
	.type	_Z10next_tokenv, @function
_Z10next_tokenv:
.LFB1367:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1367
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$168, %rsp
	.cfi_offset 3, -24
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	$-1, -160(%rbp)
.LEHB12:
	call	_Z9next_charv
	movb	%al, peek(%rip)
.L48:
	movzbl	peek(%rip), %eax
	cmpb	$32, %al
	je	.L81
	movzbl	peek(%rip), %eax
	cmpb	$9, %al
	je	.L81
	movzbl	peek(%rip), %eax
	cmpb	$10, %al
	jne	.L82
	movl	line(%rip), %eax
	addl	$1, %eax
	movl	%eax, line(%rip)
	movl	$-1, char_pos(%rip)
	jmp	.L45
.L81:
	nop
.L45:
	call	_Z9next_charv
.LEHE12:
	movb	%al, peek(%rip)
	movzbl	peek(%rip), %eax
	testb	%al, %al
	setne	%al
	testb	%al, %al
	je	.L47
	jmp	.L48
.L82:
	nop
.L47:
	movzbl	peek(%rip), %eax
	cmpb	$36, %al
	jne	.L49
	leaq	-169(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-169(%rbp), %rdx
	leaq	-144(%rbp), %rax
	movl	$.LC2, %esi
	movq	%rax, %rdi
.LEHB13:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE13:
	leaq	-169(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
.LEHB14:
	call	_Z9next_charv
	movb	%al, peek(%rip)
.L51:
	movzbl	peek(%rip), %eax
	movsbl	%al, %eax
	movl	%eax, %edi
	call	isalpha
	testl	%eax, %eax
	je	.L50
	movzbl	peek(%rip), %eax
	movsbl	%al, %edx
	leaq	-144(%rbp), %rax
	movl	%edx, %esi
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEpLEc
	call	_Z9next_charv
	movb	%al, peek(%rip)
	jmp	.L51
.L50:
	movl	input_pos(%rip), %eax
	subl	$1, %eax
	movl	%eax, input_pos(%rip)
	movl	$260, -160(%rbp)
	leaq	-112(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolC1Ev
.LEHE14:
	movl	$260, -112(%rbp)
	movl	$0, -108(%rbp)
	leaq	-144(%rbp), %rax
	leaq	-112(%rbp), %rdx
	addq	$8, %rdx
	movq	%rax, %rsi
	movq	%rdx, %rdi
.LEHB15:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEaSERKS4_
	leaq	-112(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN6SymbolC1ERKS_
.LEHE15:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB16:
	call	_Z10add_symbol6Symbol
.LEHE16:
	movl	%eax, -156(%rbp)
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB17:
	call	_ZN6SymbolD1Ev
.LEHE17:
	movq	-160(%rbp), %rbx
	leaq	-112(%rbp), %rax
	movq	%rax, %rdi
.LEHB18:
	call	_ZN6SymbolD1Ev
.LEHE18:
	leaq	-144(%rbp), %rax
	movq	%rax, %rdi
.LEHB19:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L65
.L49:
	movzbl	peek(%rip), %eax
	movsbl	%al, %eax
	subl	$48, %eax
	cmpl	$9, %eax
	ja	.L53
	movl	$0, -168(%rbp)
.L55:
	movl	-168(%rbp), %edx
	movl	%edx, %eax
	sall	$2, %eax
	addl	%edx, %eax
	addl	%eax, %eax
	movl	%eax, %ebx
	movl	$peek, %edi
	call	atoi
	addl	%ebx, %eax
	movl	%eax, -168(%rbp)
	call	_Z9next_charv
.LEHE19:
	movb	%al, peek(%rip)
	movzbl	peek(%rip), %eax
	movsbl	%al, %eax
	subl	$48, %eax
	cmpl	$9, %eax
	ja	.L54
	jmp	.L55
.L54:
	movl	input_pos(%rip), %eax
	subl	$1, %eax
	movl	%eax, input_pos(%rip)
	movl	$259, -160(%rbp)
	movl	-168(%rbp), %eax
	movl	%eax, -156(%rbp)
	movq	-160(%rbp), %rbx
	jmp	.L65
.L53:
	movzbl	peek(%rip), %eax
	cmpb	$112, %al
	jne	.L56
	leaq	-169(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-169(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC3, %esi
	movq	%rax, %rdi
.LEHB20:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE20:
	leaq	-169(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movl	$0, -164(%rbp)
.L61:
	movl	-164(%rbp), %eax
	movslq	%eax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB21:
	call	_ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE6lengthEv
	cmpq	%rax, %rbx
	setb	%al
	testb	%al, %al
	je	.L57
	movl	-164(%rbp), %eax
	movslq	%eax, %rdx
	leaq	-64(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEixEm
	movzbl	(%rax), %edx
	movzbl	peek(%rip), %eax
	cmpb	%al, %dl
	sete	%al
	testb	%al, %al
	je	.L58
	call	_Z9next_charv
.LEHE21:
	movb	%al, peek(%rip)
	jmp	.L79
.L58:
	movl	$-2, -160(%rbp)
	movq	-160(%rbp), %rbx
	jmp	.L60
.L79:
	addl	$1, -164(%rbp)
	jmp	.L61
.L57:
	movl	$261, -160(%rbp)
	movq	-160(%rbp), %rbx
.L60:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB22:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L65
.L56:
	movzbl	peek(%rip), %eax
	cmpb	$59, %al
	jne	.L62
	movl	$256, -160(%rbp)
	movl	$0, -156(%rbp)
	jmp	.L63
.L62:
	movzbl	peek(%rip), %eax
	cmpb	$43, %al
	jne	.L64
	movl	$257, -160(%rbp)
	movl	$0, -156(%rbp)
	jmp	.L63
.L64:
	movzbl	peek(%rip), %eax
	cmpb	$61, %al
	jne	.L63
	movl	$258, -160(%rbp)
	movl	$0, -156(%rbp)
.L63:
	movq	-160(%rbp), %rbx
.L65:
	movq	%rbx, %rax
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L72
	jmp	.L80
.L73:
	movq	%rax, %rbx
	leaq	-169(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
	call	_Unwind_Resume
.LEHE22:
.L76:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	jmp	.L68
.L75:
	movq	%rax, %rbx
.L68:
	leaq	-112(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	jmp	.L69
.L74:
	movq	%rax, %rbx
.L69:
	leaq	-144(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB23:
	call	_Unwind_Resume
.L77:
	movq	%rax, %rbx
	leaq	-169(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
	call	_Unwind_Resume
.LEHE23:
.L78:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB24:
	call	_Unwind_Resume
.LEHE24:
.L80:
	call	__stack_chk_fail
.L72:
	addq	$168, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1367:
	.section	.gcc_except_table
.LLSDA1367:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1367-.LLSDACSB1367
.LLSDACSB1367:
	.uleb128 .LEHB12-.LFB1367
	.uleb128 .LEHE12-.LEHB12
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB13-.LFB1367
	.uleb128 .LEHE13-.LEHB13
	.uleb128 .L73-.LFB1367
	.uleb128 0
	.uleb128 .LEHB14-.LFB1367
	.uleb128 .LEHE14-.LEHB14
	.uleb128 .L74-.LFB1367
	.uleb128 0
	.uleb128 .LEHB15-.LFB1367
	.uleb128 .LEHE15-.LEHB15
	.uleb128 .L75-.LFB1367
	.uleb128 0
	.uleb128 .LEHB16-.LFB1367
	.uleb128 .LEHE16-.LEHB16
	.uleb128 .L76-.LFB1367
	.uleb128 0
	.uleb128 .LEHB17-.LFB1367
	.uleb128 .LEHE17-.LEHB17
	.uleb128 .L75-.LFB1367
	.uleb128 0
	.uleb128 .LEHB18-.LFB1367
	.uleb128 .LEHE18-.LEHB18
	.uleb128 .L74-.LFB1367
	.uleb128 0
	.uleb128 .LEHB19-.LFB1367
	.uleb128 .LEHE19-.LEHB19
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB20-.LFB1367
	.uleb128 .LEHE20-.LEHB20
	.uleb128 .L77-.LFB1367
	.uleb128 0
	.uleb128 .LEHB21-.LFB1367
	.uleb128 .LEHE21-.LEHB21
	.uleb128 .L78-.LFB1367
	.uleb128 0
	.uleb128 .LEHB22-.LFB1367
	.uleb128 .LEHE22-.LEHB22
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB23-.LFB1367
	.uleb128 .LEHE23-.LEHB23
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB24-.LFB1367
	.uleb128 .LEHE24-.LEHB24
	.uleb128 0
	.uleb128 0
.LLSDACSE1367:
	.text
	.size	_Z10next_tokenv, .-_Z10next_tokenv
	.section	.rodata
.LC4:
	.string	"<ERR>"
.LC5:
	.string	"<EOL>"
.LC6:
	.string	"<PLUS>"
.LC7:
	.string	"<EQUALS>"
.LC8:
	.string	"<NUM,"
.LC9:
	.string	">"
.LC10:
	.string	"<VAR,#"
.LC11:
	.string	"<PRINT>"
	.text
	.globl	_Z11print_token5Token
	.type	_Z11print_token5Token, @function
_Z11print_token5Token:
.LFB1368:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -32(%rbp)
	movl	-32(%rbp), %eax
	cmpl	$258, %eax
	je	.L85
	cmpl	$258, %eax
	jg	.L86
	cmpl	$256, %eax
	je	.L87
	cmpl	$256, %eax
	jg	.L88
	cmpl	$-2, %eax
	je	.L89
	jmp	.L93
.L86:
	cmpl	$260, %eax
	je	.L90
	cmpl	$260, %eax
	jl	.L91
	cmpl	$261, %eax
	je	.L92
	jmp	.L93
.L89:
	movl	$.LC4, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	jmp	.L84
.L87:
	movl	$.LC5, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	jmp	.L84
.L88:
	movl	$.LC6, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	jmp	.L84
.L85:
	movl	$.LC7, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	jmp	.L84
.L91:
	movl	-28(%rbp), %ebx
	movl	$.LC8, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, %esi
	movq	%rax, %rdi
	call	_ZNSolsEi
	movl	$.LC9, %esi
	movq	%rax, %rdi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	jmp	.L84
.L90:
	movl	-28(%rbp), %ebx
	movl	$.LC10, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, %esi
	movq	%rax, %rdi
	call	_ZNSolsEi
	movl	$.LC9, %esi
	movq	%rax, %rdi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	jmp	.L84
.L92:
	movl	$.LC11, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	nop
.L84:
.L93:
	nop
	addq	$24, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1368:
	.size	_Z11print_token5Token, .-_Z11print_token5Token
	.section	.rodata
.LC12:
	.string	""
	.text
	.globl	_Z14read_all_linesNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
	.type	_Z14read_all_linesNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE, @function
_Z14read_all_linesNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE:
.LFB1369:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1369
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$648, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -648(%rbp)
	movq	%rsi, -656(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	leaq	-625(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-625(%rbp), %rdx
	movq	-648(%rbp), %rax
	movl	$.LC12, %esi
	movq	%rax, %rdi
.LEHB25:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE25:
	leaq	-625(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	leaq	-560(%rbp), %rax
	movq	%rax, %rdi
.LEHB26:
	call	_ZNSt13basic_fstreamIcSt11char_traitsIcEEC1Ev
.LEHE26:
	leaq	-624(%rbp), %rax
	movq	%rax, %rdi
.LEHB27:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1Ev
.LEHE27:
	movq	-656(%rbp), %rax
	movq	%rax, %rdi
.LEHB28:
	call	_ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE5c_strEv
	movq	%rax, %rcx
	leaq	-560(%rbp), %rax
	movl	$8, %edx
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZNSt13basic_fstreamIcSt11char_traitsIcEE4openEPKcSt13_Ios_Openmode
.L96:
	leaq	-560(%rbp), %rax
	addq	$264, %rax
	movq	%rax, %rdi
	call	_ZNKSt9basic_iosIcSt11char_traitsIcEE4goodEv
	testb	%al, %al
	je	.L95
	leaq	-624(%rbp), %rdx
	leaq	-560(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_EE
	leaq	-592(%rbp), %rax
	leaq	-624(%rbp), %rcx
	movl	$10, %edx
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_
.LEHE28:
	leaq	-592(%rbp), %rdx
	movq	-648(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB29:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEpLERKS4_
.LEHE29:
	leaq	-592(%rbp), %rax
	movq	%rax, %rdi
.LEHB30:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L96
.L95:
	leaq	-560(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt13basic_fstreamIcSt11char_traitsIcEE5closeEv
.LEHE30:
	nop
	leaq	-624(%rbp), %rax
	movq	%rax, %rdi
.LEHB31:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE31:
	leaq	-560(%rbp), %rax
	movq	%rax, %rdi
.LEHB32:
	call	_ZNSt13basic_fstreamIcSt11char_traitsIcEED1Ev
.LEHE32:
	jmp	.L109
.L104:
	movq	%rax, %rbx
	leaq	-625(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB33:
	call	_Unwind_Resume
.LEHE33:
.L108:
	movq	%rax, %rbx
	leaq	-592(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L100
.L107:
	movq	%rax, %rbx
.L100:
	leaq	-624(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L101
.L106:
	movq	%rax, %rbx
.L101:
	leaq	-560(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt13basic_fstreamIcSt11char_traitsIcEED1Ev
	jmp	.L102
.L105:
	movq	%rax, %rbx
.L102:
	movq	-648(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB34:
	call	_Unwind_Resume
.LEHE34:
.L109:
	movq	-648(%rbp), %rax
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L103
	call	__stack_chk_fail
.L103:
	addq	$648, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1369:
	.section	.gcc_except_table
.LLSDA1369:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1369-.LLSDACSB1369
.LLSDACSB1369:
	.uleb128 .LEHB25-.LFB1369
	.uleb128 .LEHE25-.LEHB25
	.uleb128 .L104-.LFB1369
	.uleb128 0
	.uleb128 .LEHB26-.LFB1369
	.uleb128 .LEHE26-.LEHB26
	.uleb128 .L105-.LFB1369
	.uleb128 0
	.uleb128 .LEHB27-.LFB1369
	.uleb128 .LEHE27-.LEHB27
	.uleb128 .L106-.LFB1369
	.uleb128 0
	.uleb128 .LEHB28-.LFB1369
	.uleb128 .LEHE28-.LEHB28
	.uleb128 .L107-.LFB1369
	.uleb128 0
	.uleb128 .LEHB29-.LFB1369
	.uleb128 .LEHE29-.LEHB29
	.uleb128 .L108-.LFB1369
	.uleb128 0
	.uleb128 .LEHB30-.LFB1369
	.uleb128 .LEHE30-.LEHB30
	.uleb128 .L107-.LFB1369
	.uleb128 0
	.uleb128 .LEHB31-.LFB1369
	.uleb128 .LEHE31-.LEHB31
	.uleb128 .L106-.LFB1369
	.uleb128 0
	.uleb128 .LEHB32-.LFB1369
	.uleb128 .LEHE32-.LEHB32
	.uleb128 .L105-.LFB1369
	.uleb128 0
	.uleb128 .LEHB33-.LFB1369
	.uleb128 .LEHE33-.LEHB33
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB34-.LFB1369
	.uleb128 .LEHE34-.LEHB34
	.uleb128 0
	.uleb128 0
.LLSDACSE1369:
	.text
	.size	_Z14read_all_linesNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE, .-_Z14read_all_linesNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
	.globl	lookahead
	.bss
	.align 8
	.type	lookahead, @object
	.size	lookahead, 8
lookahead:
	.zero	8
	.section	.rodata
.LC13:
	.string	"syntax error on "
.LC14:
	.string	":"
	.text
	.globl	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
	.type	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE, @function
_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE:
.LFB1370:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r12
	pushq	%rbx
	subq	$16, %rsp
	.cfi_offset 12, -24
	.cfi_offset 3, -32
	movq	%rdi, -24(%rbp)
	movl	char_pos(%rip), %ebx
	movl	line(%rip), %r12d
	movl	$.LC13, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%r12d, %esi
	movq	%rax, %rdi
	call	_ZNSolsEi
	movl	$.LC14, %esi
	movq	%rax, %rdi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	%ebx, %esi
	movq	%rax, %rdi
	call	_ZNSolsEi
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, %esi
	movq	%rax, %rdi
	call	_ZNSolsEPFRSoS_E
	movq	-24(%rbp), %rax
	movq	%rax, %rsi
	movl	$_ZSt4cout, %edi
	call	_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKNSt7__cxx1112basic_stringIS4_S5_T1_EE
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, %esi
	movq	%rax, %rdi
	call	_ZNSolsEPFRSoS_E
	nop
	addq	$16, %rsp
	popq	%rbx
	popq	%r12
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1370:
	.size	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE, .-_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
	.section	.rodata
.LC15:
	.string	"not match"
	.text
	.globl	_Z5matchi
	.type	_Z5matchi, @function
_Z5matchi:
.LFB1371:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1371
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$88, %rsp
	.cfi_offset 3, -24
	movl	%edi, -84(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	lookahead(%rip), %eax
	cmpl	-84(%rbp), %eax
	jne	.L112
.LEHB35:
	call	_Z10next_tokenv
.LEHE35:
	movq	%rax, lookahead(%rip)
	jmp	.L111
.L112:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-65(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC15, %esi
	movq	%rax, %rdi
.LEHB36:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE36:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB37:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE37:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB38:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE38:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	jmp	.L111
.L118:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L115
.L117:
	movq	%rax, %rbx
.L115:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB39:
	call	_Unwind_Resume
.LEHE39:
.L111:
	movq	-24(%rbp), %rax
	xorq	%fs:40, %rax
	je	.L116
	call	__stack_chk_fail
.L116:
	addq	$88, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1371:
	.section	.gcc_except_table
.LLSDA1371:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1371-.LLSDACSB1371
.LLSDACSB1371:
	.uleb128 .LEHB35-.LFB1371
	.uleb128 .LEHE35-.LEHB35
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB36-.LFB1371
	.uleb128 .LEHE36-.LEHB36
	.uleb128 .L117-.LFB1371
	.uleb128 0
	.uleb128 .LEHB37-.LFB1371
	.uleb128 .LEHE37-.LEHB37
	.uleb128 .L118-.LFB1371
	.uleb128 0
	.uleb128 .LEHB38-.LFB1371
	.uleb128 .LEHE38-.LEHB38
	.uleb128 .L117-.LFB1371
	.uleb128 0
	.uleb128 .LEHB39-.LFB1371
	.uleb128 .LEHE39-.LEHB39
	.uleb128 0
	.uleb128 0
.LLSDACSE1371:
	.text
	.size	_Z5matchi, .-_Z5matchi
	.globl	_Z3prgv
	.type	_Z3prgv, @function
_Z3prgv:
.LFB1372:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	call	_Z3cmdv
	call	_Z3pr2v
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1372:
	.size	_Z3prgv, .-_Z3prgv
	.section	.rodata
.LC16:
	.string	"EOL/EOF expected"
	.text
	.globl	_Z3pr2v
	.type	_Z3pr2v, @function
_Z3pr2v:
.LFB1373:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1373
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$72, %rsp
	.cfi_offset 3, -24
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	lookahead(%rip), %eax
	cmpl	$256, %eax
	jne	.L121
	movl	$256, %edi
.LEHB40:
	call	_Z5matchi
	call	_Z3prgv
.LEHE40:
	jmp	.L128
.L121:
	movl	lookahead(%rip), %eax
	cmpl	$-1, %eax
	je	.L128
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-65(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC16, %esi
	movq	%rax, %rdi
.LEHB41:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE41:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB42:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE42:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB43:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE43:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	jmp	.L128
.L127:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L124
.L126:
	movq	%rax, %rbx
.L124:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB44:
	call	_Unwind_Resume
.LEHE44:
.L128:
	nop
	movq	-24(%rbp), %rax
	xorq	%fs:40, %rax
	je	.L125
	call	__stack_chk_fail
.L125:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1373:
	.section	.gcc_except_table
.LLSDA1373:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1373-.LLSDACSB1373
.LLSDACSB1373:
	.uleb128 .LEHB40-.LFB1373
	.uleb128 .LEHE40-.LEHB40
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB41-.LFB1373
	.uleb128 .LEHE41-.LEHB41
	.uleb128 .L126-.LFB1373
	.uleb128 0
	.uleb128 .LEHB42-.LFB1373
	.uleb128 .LEHE42-.LEHB42
	.uleb128 .L127-.LFB1373
	.uleb128 0
	.uleb128 .LEHB43-.LFB1373
	.uleb128 .LEHE43-.LEHB43
	.uleb128 .L126-.LFB1373
	.uleb128 0
	.uleb128 .LEHB44-.LFB1373
	.uleb128 .LEHE44-.LEHB44
	.uleb128 0
	.uleb128 0
.LLSDACSE1373:
	.text
	.size	_Z3pr2v, .-_Z3pr2v
	.section	.rodata
.LC17:
	.string	"Unrecognized Command"
	.text
	.globl	_Z3cmdv
	.type	_Z3cmdv, @function
_Z3cmdv:
.LFB1374:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1374
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$72, %rsp
	.cfi_offset 3, -24
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	lookahead(%rip), %eax
	cmpl	$259, %eax
	jne	.L130
.LEHB45:
	call	_Z3expv
	jmp	.L139
.L130:
	movl	lookahead(%rip), %eax
	cmpl	$260, %eax
	jne	.L132
	call	_Z3atrv
	jmp	.L139
.L132:
	movl	lookahead(%rip), %eax
	cmpl	$261, %eax
	jne	.L133
	call	_Z3outv
.LEHE45:
	jmp	.L139
.L133:
	movl	lookahead(%rip), %eax
	cmpl	$-1, %eax
	je	.L139
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-65(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC17, %esi
	movq	%rax, %rdi
.LEHB46:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE46:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB47:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE47:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB48:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE48:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	jmp	.L139
.L138:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L135
.L137:
	movq	%rax, %rbx
.L135:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB49:
	call	_Unwind_Resume
.LEHE49:
.L139:
	nop
	movq	-24(%rbp), %rax
	xorq	%fs:40, %rax
	je	.L136
	call	__stack_chk_fail
.L136:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1374:
	.section	.gcc_except_table
.LLSDA1374:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1374-.LLSDACSB1374
.LLSDACSB1374:
	.uleb128 .LEHB45-.LFB1374
	.uleb128 .LEHE45-.LEHB45
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB46-.LFB1374
	.uleb128 .LEHE46-.LEHB46
	.uleb128 .L137-.LFB1374
	.uleb128 0
	.uleb128 .LEHB47-.LFB1374
	.uleb128 .LEHE47-.LEHB47
	.uleb128 .L138-.LFB1374
	.uleb128 0
	.uleb128 .LEHB48-.LFB1374
	.uleb128 .LEHE48-.LEHB48
	.uleb128 .L137-.LFB1374
	.uleb128 0
	.uleb128 .LEHB49-.LFB1374
	.uleb128 .LEHE49-.LEHB49
	.uleb128 0
	.uleb128 0
.LLSDACSE1374:
	.text
	.size	_Z3cmdv, .-_Z3cmdv
	.globl	_Z3expv
	.type	_Z3expv, @function
_Z3expv:
.LFB1375:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	lookahead(%rip), %eax
	cmpl	$259, %eax
	jne	.L141
	movl	lookahead+4(%rip), %eax
	movl	%eax, -8(%rbp)
	movl	$259, %edi
	call	_Z5matchi
	call	_Z3rstv
	movl	%eax, -4(%rbp)
	movl	-8(%rbp), %edx
	movl	-4(%rbp), %eax
	addl	%edx, %eax
	jmp	.L142
.L141:
	movl	$0, %eax
.L142:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1375:
	.size	_Z3expv, .-_Z3expv
	.section	.rodata
.LC18:
	.string	"Invalid Operation"
	.text
	.globl	_Z3rstv
	.type	_Z3rstv, @function
_Z3rstv:
.LFB1376:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1376
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$72, %rsp
	.cfi_offset 3, -24
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	lookahead(%rip), %eax
	cmpl	$257, %eax
	jne	.L144
	movl	$257, %edi
.LEHB50:
	call	_Z5matchi
	call	_Z3expv
.LEHE50:
	jmp	.L145
.L144:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-65(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC18, %esi
	movq	%rax, %rdi
.LEHB51:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE51:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB52:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE52:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB53:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE53:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movl	$0, %eax
.L145:
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L148
	jmp	.L151
.L150:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L147
.L149:
	movq	%rax, %rbx
.L147:
	leaq	-65(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB54:
	call	_Unwind_Resume
.LEHE54:
.L151:
	call	__stack_chk_fail
.L148:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1376:
	.section	.gcc_except_table
.LLSDA1376:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1376-.LLSDACSB1376
.LLSDACSB1376:
	.uleb128 .LEHB50-.LFB1376
	.uleb128 .LEHE50-.LEHB50
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB51-.LFB1376
	.uleb128 .LEHE51-.LEHB51
	.uleb128 .L149-.LFB1376
	.uleb128 0
	.uleb128 .LEHB52-.LFB1376
	.uleb128 .LEHE52-.LEHB52
	.uleb128 .L150-.LFB1376
	.uleb128 0
	.uleb128 .LEHB53-.LFB1376
	.uleb128 .LEHE53-.LEHB53
	.uleb128 .L149-.LFB1376
	.uleb128 0
	.uleb128 .LEHB54-.LFB1376
	.uleb128 .LEHE54-.LEHB54
	.uleb128 0
	.uleb128 0
.LLSDACSE1376:
	.text
	.size	_Z3rstv, .-_Z3rstv
	.section	.rodata
.LC19:
	.string	"Impossible assign value"
.LC20:
	.string	"VAR expected"
	.text
	.globl	_Z3atrv
	.type	_Z3atrv, @function
_Z3atrv:
.LFB1377:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1377
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$72, %rsp
	.cfi_offset 3, -24
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	lookahead(%rip), %eax
	cmpl	$260, %eax
	jne	.L153
	movl	lookahead+4(%rip), %eax
	movl	%eax, -72(%rbp)
	movl	$260, %edi
.LEHB55:
	call	_Z5matchi
	movl	$258, %edi
	call	_Z5matchi
	call	_Z3valv
.LEHE55:
	movl	%eax, -68(%rbp)
	movl	-68(%rbp), %edx
	movl	-72(%rbp), %eax
	movl	%edx, %esi
	movl	%eax, %edi
	call	_Z13update_symbolii
	xorl	$1, %eax
	testb	%al, %al
	je	.L165
	leaq	-73(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-73(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC19, %esi
	movq	%rax, %rdi
.LEHB56:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE56:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB57:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE57:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB58:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE58:
	leaq	-73(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	jmp	.L165
.L153:
	leaq	-73(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-73(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC20, %esi
	movq	%rax, %rdi
.LEHB59:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE59:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB60:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE60:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB61:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE61:
	leaq	-73(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	jmp	.L165
.L162:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L157
.L161:
	movq	%rax, %rbx
.L157:
	leaq	-73(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB62:
	call	_Unwind_Resume
.LEHE62:
.L164:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L159
.L163:
	movq	%rax, %rbx
.L159:
	leaq	-73(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB63:
	call	_Unwind_Resume
.LEHE63:
.L165:
	nop
	movq	-24(%rbp), %rax
	xorq	%fs:40, %rax
	je	.L160
	call	__stack_chk_fail
.L160:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1377:
	.section	.gcc_except_table
.LLSDA1377:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1377-.LLSDACSB1377
.LLSDACSB1377:
	.uleb128 .LEHB55-.LFB1377
	.uleb128 .LEHE55-.LEHB55
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB56-.LFB1377
	.uleb128 .LEHE56-.LEHB56
	.uleb128 .L161-.LFB1377
	.uleb128 0
	.uleb128 .LEHB57-.LFB1377
	.uleb128 .LEHE57-.LEHB57
	.uleb128 .L162-.LFB1377
	.uleb128 0
	.uleb128 .LEHB58-.LFB1377
	.uleb128 .LEHE58-.LEHB58
	.uleb128 .L161-.LFB1377
	.uleb128 0
	.uleb128 .LEHB59-.LFB1377
	.uleb128 .LEHE59-.LEHB59
	.uleb128 .L163-.LFB1377
	.uleb128 0
	.uleb128 .LEHB60-.LFB1377
	.uleb128 .LEHE60-.LEHB60
	.uleb128 .L164-.LFB1377
	.uleb128 0
	.uleb128 .LEHB61-.LFB1377
	.uleb128 .LEHE61-.LEHB61
	.uleb128 .L163-.LFB1377
	.uleb128 0
	.uleb128 .LEHB62-.LFB1377
	.uleb128 .LEHE62-.LEHB62
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB63-.LFB1377
	.uleb128 .LEHE63-.LEHB63
	.uleb128 0
	.uleb128 0
.LLSDACSE1377:
	.text
	.size	_Z3atrv, .-_Z3atrv
	.globl	_Z3outv
	.type	_Z3outv, @function
_Z3outv:
.LFB1378:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	lookahead(%rip), %eax
	cmpl	$261, %eax
	jne	.L168
	movl	$261, %edi
	call	_Z5matchi
	call	_Z3valv
	movl	%eax, -4(%rbp)
	movl	-4(%rbp), %eax
	movl	%eax, %esi
	movl	$_ZSt4cout, %edi
	call	_ZNSolsEi
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, %esi
	movq	%rax, %rdi
	call	_ZNSolsEPFRSoS_E
.L168:
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1378:
	.size	_Z3outv, .-_Z3outv
	.section	.rodata
.LC21:
	.string	"VAR not found"
.LC22:
	.string	"VAR or NUM expected"
	.text
	.globl	_Z3valv
	.type	_Z3valv, @function
_Z3valv:
.LFB1379:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1379
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$120, %rsp
	.cfi_offset 3, -24
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movl	lookahead(%rip), %eax
	cmpl	$260, %eax
	jne	.L170
	movq	lookahead(%rip), %rax
	movq	%rax, -112(%rbp)
	movl	$260, %edi
.LEHB64:
	call	_Z5matchi
	movl	-108(%rbp), %edx
	leaq	-64(%rbp), %rax
	movl	%edx, %esi
	movq	%rax, %rdi
	call	_Z10get_symboli
.LEHE64:
	movl	-64(%rbp), %eax
	cmpl	$-2, %eax
	je	.L171
	movl	-60(%rbp), %ebx
	jmp	.L172
.L171:
	leaq	-113(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-113(%rbp), %rdx
	leaq	-96(%rbp), %rax
	movl	$.LC21, %esi
	movq	%rax, %rdi
.LEHB65:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE65:
	leaq	-96(%rbp), %rax
	movq	%rax, %rdi
.LEHB66:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE66:
	leaq	-96(%rbp), %rax
	movq	%rax, %rdi
.LEHB67:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE67:
	leaq	-113(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movl	$0, %ebx
.L172:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB68:
	call	_ZN6SymbolD1Ev
	jmp	.L173
.L170:
	movl	lookahead(%rip), %eax
	cmpl	$259, %eax
	jne	.L174
	call	_Z3expv
.LEHE68:
	movl	%eax, %ebx
	jmp	.L173
.L174:
	leaq	-112(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	leaq	-112(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movl	$.LC22, %esi
	movq	%rax, %rdi
.LEHB69:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE69:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB70:
	call	_Z5errorNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE70:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB71:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE71:
	leaq	-112(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movl	$-1, %ebx
.L173:
	movl	%ebx, %eax
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L179
	jmp	.L184
.L181:
	movq	%rax, %rbx
	leaq	-96(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L176
.L180:
	movq	%rax, %rbx
.L176:
	leaq	-113(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB72:
	call	_Unwind_Resume
.LEHE72:
.L183:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L178
.L182:
	movq	%rax, %rbx
.L178:
	leaq	-112(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB73:
	call	_Unwind_Resume
.LEHE73:
.L184:
	call	__stack_chk_fail
.L179:
	addq	$120, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1379:
	.section	.gcc_except_table
.LLSDA1379:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1379-.LLSDACSB1379
.LLSDACSB1379:
	.uleb128 .LEHB64-.LFB1379
	.uleb128 .LEHE64-.LEHB64
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB65-.LFB1379
	.uleb128 .LEHE65-.LEHB65
	.uleb128 .L180-.LFB1379
	.uleb128 0
	.uleb128 .LEHB66-.LFB1379
	.uleb128 .LEHE66-.LEHB66
	.uleb128 .L181-.LFB1379
	.uleb128 0
	.uleb128 .LEHB67-.LFB1379
	.uleb128 .LEHE67-.LEHB67
	.uleb128 .L180-.LFB1379
	.uleb128 0
	.uleb128 .LEHB68-.LFB1379
	.uleb128 .LEHE68-.LEHB68
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB69-.LFB1379
	.uleb128 .LEHE69-.LEHB69
	.uleb128 .L182-.LFB1379
	.uleb128 0
	.uleb128 .LEHB70-.LFB1379
	.uleb128 .LEHE70-.LEHB70
	.uleb128 .L183-.LFB1379
	.uleb128 0
	.uleb128 .LEHB71-.LFB1379
	.uleb128 .LEHE71-.LEHB71
	.uleb128 .L182-.LFB1379
	.uleb128 0
	.uleb128 .LEHB72-.LFB1379
	.uleb128 .LEHE72-.LEHB72
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB73-.LFB1379
	.uleb128 .LEHE73-.LEHB73
	.uleb128 0
	.uleb128 0
.LLSDACSE1379:
	.text
	.size	_Z3valv, .-_Z3valv
	.section	.rodata
.LC23:
	.string	"error on read source file"
	.text
	.globl	main
	.type	main, @function
main:
.LFB1380:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1380
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$120, %rsp
	.cfi_offset 3, -24
	movl	%edi, -116(%rbp)
	movq	%rsi, -128(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	cmpl	$1, -116(%rbp)
	jle	.L186
	leaq	-97(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcEC1Ev
	movq	-128(%rbp), %rax
	addq	$8, %rax
	movq	(%rax), %rcx
	leaq	-97(%rbp), %rdx
	leaq	-96(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
.LEHB74:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_
.LEHE74:
	leaq	-64(%rbp), %rax
	leaq	-96(%rbp), %rdx
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB75:
	call	_Z14read_all_linesNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE
.LEHE75:
	leaq	-64(%rbp), %rax
	movq	%rax, %rsi
	movl	$_Z5inputB5cxx11, %edi
.LEHB76:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEaSERKS4_
.LEHE76:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB77:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE77:
	leaq	-96(%rbp), %rax
	movq	%rax, %rdi
.LEHB78:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
.LEHE78:
	leaq	-97(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
.LEHB79:
	call	_Z10next_tokenv
	movq	%rax, lookahead(%rip)
	call	_Z3prgv
	call	_Z18print_symbol_tablev
	movl	$0, %eax
	jmp	.L188
.L186:
	movl	$.LC23, %esi
	movl	$_ZSt4cout, %edi
	call	_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, %esi
	movq	%rax, %rdi
	call	_ZNSolsEPFRSoS_E
.LEHE79:
	movl	$1, %eax
.L188:
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L192
	jmp	.L196
.L195:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L190
.L194:
	movq	%rax, %rbx
.L190:
	leaq	-96(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	jmp	.L191
.L193:
	movq	%rax, %rbx
.L191:
	leaq	-97(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaIcED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB80:
	call	_Unwind_Resume
.LEHE80:
.L196:
	call	__stack_chk_fail
.L192:
	addq	$120, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1380:
	.section	.gcc_except_table
.LLSDA1380:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1380-.LLSDACSB1380
.LLSDACSB1380:
	.uleb128 .LEHB74-.LFB1380
	.uleb128 .LEHE74-.LEHB74
	.uleb128 .L193-.LFB1380
	.uleb128 0
	.uleb128 .LEHB75-.LFB1380
	.uleb128 .LEHE75-.LEHB75
	.uleb128 .L194-.LFB1380
	.uleb128 0
	.uleb128 .LEHB76-.LFB1380
	.uleb128 .LEHE76-.LEHB76
	.uleb128 .L195-.LFB1380
	.uleb128 0
	.uleb128 .LEHB77-.LFB1380
	.uleb128 .LEHE77-.LEHB77
	.uleb128 .L194-.LFB1380
	.uleb128 0
	.uleb128 .LEHB78-.LFB1380
	.uleb128 .LEHE78-.LEHB78
	.uleb128 .L193-.LFB1380
	.uleb128 0
	.uleb128 .LEHB79-.LFB1380
	.uleb128 .LEHE79-.LEHB79
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB80-.LFB1380
	.uleb128 .LEHE80-.LEHB80
	.uleb128 0
	.uleb128 0
.LLSDACSE1380:
	.text
	.size	main, .-main
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EEC2Ev,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EEC5Ev,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EEC2Ev
	.type	_ZNSt6vectorI6SymbolSaIS0_EEC2Ev, @function
_ZNSt6vectorI6SymbolSaIS0_EEC2Ev:
.LFB1383:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1383:
	.size	_ZNSt6vectorI6SymbolSaIS0_EEC2Ev, .-_ZNSt6vectorI6SymbolSaIS0_EEC2Ev
	.weak	_ZNSt6vectorI6SymbolSaIS0_EEC1Ev
	.set	_ZNSt6vectorI6SymbolSaIS0_EEC1Ev,_ZNSt6vectorI6SymbolSaIS0_EEC2Ev
	.section	.text._ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv,"axG",@progbits,_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv,comdat
	.align 2
	.weak	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	.type	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv, @function
_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv:
.LFB1385:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	8(%rax), %rax
	movq	%rax, %rdx
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$3, %rax
	movq	%rax, %rdx
	movabsq	$-3689348814741910323, %rax
	imulq	%rdx, %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1385:
	.size	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv, .-_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EEixEm,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EEixEm,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EEixEm
	.type	_ZNSt6vectorI6SymbolSaIS0_EEixEm, @function
_ZNSt6vectorI6SymbolSaIS0_EEixEm:
.LFB1386:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-8(%rbp), %rax
	movq	(%rax), %rcx
	movq	-16(%rbp), %rdx
	movq	%rdx, %rax
	salq	$2, %rax
	addq	%rdx, %rax
	salq	$3, %rax
	addq	%rcx, %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1386:
	.size	_ZNSt6vectorI6SymbolSaIS0_EEixEm, .-_ZNSt6vectorI6SymbolSaIS0_EEixEm
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_
	.type	_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_, @function
_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_:
.LFB1398:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-8(%rbp), %rax
	movq	8(%rax), %rdx
	movq	-8(%rbp), %rax
	movq	16(%rax), %rax
	cmpq	%rax, %rdx
	je	.L203
	movq	-8(%rbp), %rax
	movq	8(%rax), %rcx
	movq	-8(%rbp), %rax
	movq	-16(%rbp), %rdx
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_
	movq	-8(%rbp), %rax
	movq	8(%rax), %rax
	leaq	40(%rax), %rdx
	movq	-8(%rbp), %rax
	movq	%rdx, 8(%rax)
	jmp	.L205
.L203:
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt6vectorI6SymbolSaIS0_EE3endEv
	movq	%rax, %rcx
	movq	-16(%rbp), %rdx
	movq	-8(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_
.L205:
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1398:
	.size	_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_, .-_ZNSt6vectorI6SymbolSaIS0_EE9push_backERKS0_
	.section	.text._ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_,"axG",@progbits,_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_,comdat
	.weak	_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_
	.type	_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_, @function
_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_:
.LFB1429:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1429
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$56, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -40(%rbp)
	movq	%rsi, -48(%rbp)
	movl	%edx, %eax
	movb	%al, -52(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movq	-48(%rbp), %rdx
	movq	-40(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB81:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1ERKS4_
.LEHE81:
	movsbl	-52(%rbp), %edx
	movq	-40(%rbp), %rax
	movl	$1, %esi
	movq	%rax, %rdi
.LEHB82:
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE6appendEmc
.LEHE82:
	jmp	.L211
.L210:
	movq	%rax, %rbx
	movq	-40(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB83:
	call	_Unwind_Resume
.LEHE83:
.L211:
	movq	-40(%rbp), %rax
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L209
	call	__stack_chk_fail
.L209:
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1429:
	.section	.gcc_except_table
.LLSDA1429:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1429-.LLSDACSB1429
.LLSDACSB1429:
	.uleb128 .LEHB81-.LFB1429
	.uleb128 .LEHE81-.LEHB81
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB82-.LFB1429
	.uleb128 .LEHE82-.LEHB82
	.uleb128 .L210-.LFB1429
	.uleb128 0
	.uleb128 .LEHB83-.LFB1429
	.uleb128 .LEHE83-.LEHB83
	.uleb128 0
	.uleb128 0
.LLSDACSE1429:
	.section	.text._ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_,"axG",@progbits,_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_,comdat
	.size	_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_, .-_ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EERKS8_S5_
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD5Ev,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev:
.LFB1436:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaI6SymbolED2Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1436:
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD1Ev
	.set	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD1Ev,_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD2Ev
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EEC5Ev,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev:
.LFB1438:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC1Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1438:
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EEC1Ev
	.set	_ZNSt12_Vector_baseI6SymbolSaIS0_EEC1Ev,_ZNSt12_Vector_baseI6SymbolSaIS0_EEC2Ev
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EED5Ev,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev:
.LFB1441:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1441
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -24(%rbp)
	movq	-24(%rbp), %rax
	movq	16(%rax), %rax
	movq	%rax, %rdx
	movq	-24(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$3, %rax
	movq	%rax, %rdx
	movabsq	$-3689348814741910323, %rax
	imulq	%rdx, %rax
	movq	%rax, %rdx
	movq	-24(%rbp), %rax
	movq	(%rax), %rcx
	movq	-24(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
.LEHB84:
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m
.LEHE84:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD1Ev
	jmp	.L217
.L216:
	movq	%rax, %rbx
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implD1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB85:
	call	_Unwind_Resume
.LEHE85:
.L217:
	addq	$24, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1441:
	.section	.gcc_except_table
.LLSDA1441:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1441-.LLSDACSB1441
.LLSDACSB1441:
	.uleb128 .LEHB84-.LFB1441
	.uleb128 .LEHE84-.LEHB84
	.uleb128 .L216-.LFB1441
	.uleb128 0
	.uleb128 .LEHB85-.LFB1441
	.uleb128 .LEHE85-.LEHB85
	.uleb128 0
	.uleb128 0
.LLSDACSE1441:
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EED5Ev,comdat
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EED1Ev
	.set	_ZNSt12_Vector_baseI6SymbolSaIS0_EED1Ev,_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev
	.section	.text._ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_,"axG",@progbits,_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_,comdat
	.weak	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_
	.type	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_, @function
_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_:
.LFB1456:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	-24(%rbp), %rdx
	movq	-16(%rbp), %rcx
	movq	-8(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1456:
	.size	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_, .-_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_
	.section	.rodata
.LC24:
	.string	"vector::_M_insert_aux"
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_
	.type	_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_, @function
_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_:
.LFB1457:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1457
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r12
	pushq	%rbx
	addq	$-128, %rsp
	.cfi_offset 12, -24
	.cfi_offset 3, -32
	movq	%rdi, -120(%rbp)
	movq	%rsi, -128(%rbp)
	movq	%rdx, -136(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movq	-120(%rbp), %rax
	movq	8(%rax), %rdx
	movq	-120(%rbp), %rax
	movq	16(%rax), %rax
	cmpq	%rax, %rdx
	je	.L220
	movq	-120(%rbp), %rax
	movq	8(%rax), %rax
	leaq	-40(%rax), %rdx
	movq	-120(%rbp), %rax
	movq	8(%rax), %rcx
	movq	-120(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
.LEHB86:
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_
	movq	-120(%rbp), %rax
	movq	8(%rax), %rax
	leaq	40(%rax), %rdx
	movq	-120(%rbp), %rax
	movq	%rdx, 8(%rax)
	movq	-136(%rbp), %rdx
	leaq	-64(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN6SymbolC1ERKS_
.LEHE86:
	movq	-120(%rbp), %rax
	movq	8(%rax), %rax
	leaq	-40(%rax), %r12
	movq	-120(%rbp), %rax
	movq	8(%rax), %rax
	leaq	-80(%rax), %rbx
	leaq	-128(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	movq	(%rax), %rax
	movq	%r12, %rdx
	movq	%rbx, %rsi
	movq	%rax, %rdi
.LEHB87:
	call	_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_
	leaq	-128(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv
	movq	%rax, %rdx
	leaq	-64(%rbp), %rax
	movq	%rax, %rsi
	movq	%rdx, %rdi
	call	_ZN6SymbolaSERKS_
.LEHE87:
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
.LEHB88:
	call	_ZN6SymbolD1Ev
	jmp	.L219
.L220:
	movq	-120(%rbp), %rax
	movl	$.LC24, %edx
	movl	$1, %esi
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc
	movq	%rax, -88(%rbp)
	movq	-120(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt6vectorI6SymbolSaIS0_EE5beginEv
	movq	%rax, -112(%rbp)
	leaq	-112(%rbp), %rdx
	leaq	-128(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_
	movq	%rax, -80(%rbp)
	movq	-120(%rbp), %rax
	movq	-88(%rbp), %rdx
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm
.LEHE88:
	movq	%rax, -72(%rbp)
	movq	-72(%rbp), %rax
	movq	%rax, -96(%rbp)
	movq	-80(%rbp), %rdx
	movq	%rdx, %rax
	salq	$2, %rax
	addq	%rdx, %rax
	salq	$3, %rax
	movq	%rax, %rdx
	movq	-72(%rbp), %rax
	leaq	(%rdx,%rax), %rcx
	movq	-120(%rbp), %rax
	movq	-136(%rbp), %rdx
	movq	%rcx, %rsi
	movq	%rax, %rdi
.LEHB89:
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE9constructIS1_EEvRS2_PS1_RKT_
	movq	$0, -96(%rbp)
	movq	-120(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	movq	%rax, %rbx
	leaq	-128(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	movq	(%rax), %rsi
	movq	-120(%rbp), %rax
	movq	(%rax), %rax
	movq	-72(%rbp), %rdx
	movq	%rbx, %rcx
	movq	%rax, %rdi
	call	_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_
	movq	%rax, -96(%rbp)
	addq	$40, -96(%rbp)
	movq	-120(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	movq	%rax, %r12
	movq	-120(%rbp), %rax
	movq	8(%rax), %rbx
	leaq	-128(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	movq	(%rax), %rax
	movq	-96(%rbp), %rdx
	movq	%r12, %rcx
	movq	%rbx, %rsi
	movq	%rax, %rdi
	call	_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_
.LEHE89:
	movq	%rax, -96(%rbp)
	movq	-120(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	movq	%rax, %rdx
	movq	-120(%rbp), %rax
	movq	8(%rax), %rcx
	movq	-120(%rbp), %rax
	movq	(%rax), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
.LEHB90:
	call	_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E
	movq	-120(%rbp), %rax
	movq	16(%rax), %rax
	movq	%rax, %rdx
	movq	-120(%rbp), %rax
	movq	(%rax), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$3, %rax
	movq	%rax, %rdx
	movabsq	$-3689348814741910323, %rax
	imulq	%rdx, %rax
	movq	%rax, %rdx
	movq	-120(%rbp), %rax
	movq	(%rax), %rcx
	movq	-120(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m
.LEHE90:
	movq	-120(%rbp), %rax
	movq	-72(%rbp), %rdx
	movq	%rdx, (%rax)
	movq	-120(%rbp), %rax
	movq	-96(%rbp), %rdx
	movq	%rdx, 8(%rax)
	movq	-88(%rbp), %rdx
	movq	%rdx, %rax
	salq	$2, %rax
	addq	%rdx, %rax
	salq	$3, %rax
	movq	%rax, %rdx
	movq	-72(%rbp), %rax
	addq	%rax, %rdx
	movq	-120(%rbp), %rax
	movq	%rdx, 16(%rax)
	jmp	.L219
.L228:
	movq	%rax, %rbx
	leaq	-64(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB91:
	call	_Unwind_Resume
.LEHE91:
.L229:
	movq	%rax, %rdi
	call	__cxa_begin_catch
	cmpq	$0, -96(%rbp)
	jne	.L224
	movq	-80(%rbp), %rdx
	movq	%rdx, %rax
	salq	$2, %rax
	addq	%rdx, %rax
	salq	$3, %rax
	movq	%rax, %rdx
	movq	-72(%rbp), %rax
	addq	%rax, %rdx
	movq	-120(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB92:
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_
	jmp	.L225
.L224:
	movq	-120(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	movq	%rax, %rdx
	movq	-96(%rbp), %rcx
	movq	-72(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E
.L225:
	movq	-120(%rbp), %rax
	movq	-88(%rbp), %rdx
	movq	-72(%rbp), %rcx
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m
	call	__cxa_rethrow
.LEHE92:
.L230:
	movq	%rax, %rbx
	call	__cxa_end_catch
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB93:
	call	_Unwind_Resume
.LEHE93:
.L219:
	movq	-24(%rbp), %rax
	xorq	%fs:40, %rax
	je	.L227
	call	__stack_chk_fail
.L227:
	subq	$-128, %rsp
	popq	%rbx
	popq	%r12
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1457:
	.section	.gcc_except_table
	.align 4
.LLSDA1457:
	.byte	0xff
	.byte	0x3
	.uleb128 .LLSDATT1457-.LLSDATTD1457
.LLSDATTD1457:
	.byte	0x1
	.uleb128 .LLSDACSE1457-.LLSDACSB1457
.LLSDACSB1457:
	.uleb128 .LEHB86-.LFB1457
	.uleb128 .LEHE86-.LEHB86
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB87-.LFB1457
	.uleb128 .LEHE87-.LEHB87
	.uleb128 .L228-.LFB1457
	.uleb128 0
	.uleb128 .LEHB88-.LFB1457
	.uleb128 .LEHE88-.LEHB88
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB89-.LFB1457
	.uleb128 .LEHE89-.LEHB89
	.uleb128 .L229-.LFB1457
	.uleb128 0x1
	.uleb128 .LEHB90-.LFB1457
	.uleb128 .LEHE90-.LEHB90
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB91-.LFB1457
	.uleb128 .LEHE91-.LEHB91
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB92-.LFB1457
	.uleb128 .LEHE92-.LEHB92
	.uleb128 .L230-.LFB1457
	.uleb128 0
	.uleb128 .LEHB93-.LFB1457
	.uleb128 .LEHE93-.LEHB93
	.uleb128 0
	.uleb128 0
.LLSDACSE1457:
	.byte	0x1
	.byte	0
	.align 4
	.long	0

.LLSDATT1457:
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_,comdat
	.size	_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_, .-_ZNSt6vectorI6SymbolSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EE3endEv,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EE3endEv,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EE3endEv
	.type	_ZNSt6vectorI6SymbolSaIS0_EE3endEv, @function
_ZNSt6vectorI6SymbolSaIS0_EE3endEv:
.LFB1458:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -8(%rbp)
	xorl	%eax, %eax
	movq	-24(%rbp), %rax
	leaq	8(%rax), %rdx
	leaq	-16(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC1ERKS2_
	movq	-16(%rbp), %rax
	movq	-8(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L233
	call	__stack_chk_fail
.L233:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1458:
	.size	_ZNSt6vectorI6SymbolSaIS0_EE3endEv, .-_ZNSt6vectorI6SymbolSaIS0_EE3endEv
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC5Ev,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev:
.LFB1494:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSaI6SymbolEC2Ev
	movq	-8(%rbp), %rax
	movq	$0, (%rax)
	movq	-8(%rbp), %rax
	movq	$0, 8(%rax)
	movq	-8(%rbp), %rax
	movq	$0, 16(%rax)
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1494:
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC1Ev
	.set	_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC1Ev,_ZNSt12_Vector_baseI6SymbolSaIS0_EE12_Vector_implC2Ev
	.section	.text._ZNSaI6SymbolED2Ev,"axG",@progbits,_ZNSaI6SymbolED5Ev,comdat
	.align 2
	.weak	_ZNSaI6SymbolED2Ev
	.type	_ZNSaI6SymbolED2Ev, @function
_ZNSaI6SymbolED2Ev:
.LFB1497:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1497:
	.size	_ZNSaI6SymbolED2Ev, .-_ZNSaI6SymbolED2Ev
	.weak	_ZNSaI6SymbolED1Ev
	.set	_ZNSaI6SymbolED1Ev,_ZNSaI6SymbolED2Ev
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m:
.LFB1499:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	cmpq	$0, -16(%rbp)
	je	.L238
	movq	-8(%rbp), %rax
	movq	-24(%rbp), %rdx
	movq	-16(%rbp), %rcx
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m
.L238:
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1499:
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EE13_M_deallocateEPS0_m
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_,comdat
	.align 2
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_
	.type	_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_, @function
_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_:
.LFB1506:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1506
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r13
	pushq	%r12
	pushq	%rbx
	subq	$40, %rsp
	.cfi_offset 13, -24
	.cfi_offset 12, -32
	.cfi_offset 3, -40
	movq	%rdi, -40(%rbp)
	movq	%rsi, -48(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-48(%rbp), %r12
	movq	%r12, %rsi
	movl	$40, %edi
	call	_ZnwmPv
	movq	%rax, %rbx
	testq	%rbx, %rbx
	je	.L244
	movq	-56(%rbp), %rax
	movq	%rax, %rsi
	movq	%rbx, %rdi
.LEHB94:
	call	_ZN6SymbolC1ERKS_
.LEHE94:
	jmp	.L244
.L243:
	movq	%rax, %r13
	movq	%r12, %rsi
	movq	%rbx, %rdi
	call	_ZdlPvS_
	movq	%r13, %rax
	movq	%rax, %rdi
.LEHB95:
	call	_Unwind_Resume
.LEHE95:
.L244:
	nop
	addq	$40, %rsp
	popq	%rbx
	popq	%r12
	popq	%r13
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1506:
	.section	.gcc_except_table
.LLSDA1506:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1506-.LLSDACSB1506
.LLSDACSB1506:
	.uleb128 .LEHB94-.LFB1506
	.uleb128 .LEHE94-.LEHB94
	.uleb128 .L243-.LFB1506
	.uleb128 0
	.uleb128 .LEHB95-.LFB1506
	.uleb128 .LEHE95-.LEHB95
	.uleb128 0
	.uleb128 0
.LLSDACSE1506:
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_,comdat
	.size	_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_, .-_ZN9__gnu_cxx13new_allocatorI6SymbolE9constructEPS1_RKS1_
	.section	.text._ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv,"axG",@progbits,_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv,comdat
	.align 2
	.weak	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	.type	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv, @function
_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv:
.LFB1507:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1507:
	.size	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv, .-_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	.section	.text._ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_,"axG",@progbits,_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_,comdat
	.weak	_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_
	.type	_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_, @function
_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_:
.LFB1508:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$40, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	%rdx, -40(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_
	movq	%rax, %rbx
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_
	movq	%rax, %rcx
	movq	-40(%rbp), %rax
	movq	%rax, %rdx
	movq	%rbx, %rsi
	movq	%rcx, %rdi
	call	_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1508:
	.size	_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_, .-_ZSt13copy_backwardIP6SymbolS1_ET0_T_S3_S2_
	.section	.text._ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv,"axG",@progbits,_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv,comdat
	.align 2
	.weak	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv
	.type	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv, @function
_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv:
.LFB1509:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	(%rax), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1509:
	.size	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv, .-_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEdeEv
	.section	.text._ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc,"axG",@progbits,_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc,comdat
	.align 2
	.weak	_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc
	.type	_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc, @function
_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc:
.LFB1510:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$72, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -56(%rbp)
	movq	%rsi, -64(%rbp)
	movq	%rdx, -72(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -24(%rbp)
	xorl	%eax, %eax
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv
	movq	%rax, %rbx
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	subq	%rax, %rbx
	movq	%rbx, %rdx
	movq	-64(%rbp), %rax
	cmpq	%rax, %rdx
	setb	%al
	testb	%al, %al
	je	.L252
	movq	-72(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt20__throw_length_errorPKc
.L252:
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	movq	%rax, %rbx
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	movq	%rax, -40(%rbp)
	leaq	-64(%rbp), %rdx
	leaq	-40(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZSt3maxImERKT_S2_S2_
	movq	(%rax), %rax
	addq	%rbx, %rax
	movq	%rax, -32(%rbp)
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE4sizeEv
	cmpq	-32(%rbp), %rax
	ja	.L253
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv
	cmpq	-32(%rbp), %rax
	jnb	.L254
.L253:
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv
	jmp	.L256
.L254:
	movq	-32(%rbp), %rax
.L256:
	movq	-24(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L257
	call	__stack_chk_fail
.L257:
	addq	$72, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1510:
	.size	_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc, .-_ZNKSt6vectorI6SymbolSaIS0_EE12_M_check_lenEmPKc
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EE5beginEv,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EE5beginEv,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EE5beginEv
	.type	_ZNSt6vectorI6SymbolSaIS0_EE5beginEv, @function
_ZNSt6vectorI6SymbolSaIS0_EE5beginEv:
.LFB1511:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -8(%rbp)
	xorl	%eax, %eax
	movq	-24(%rbp), %rdx
	leaq	-16(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC1ERKS2_
	movq	-16(%rbp), %rax
	movq	-8(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L260
	call	__stack_chk_fail
.L260:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1511:
	.size	_ZNSt6vectorI6SymbolSaIS0_EE5beginEv, .-_ZNSt6vectorI6SymbolSaIS0_EE5beginEv
	.section	.text._ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_,"axG",@progbits,_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_,comdat
	.weak	_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_
	.type	_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_, @function
_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_:
.LFB1512:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	movq	(%rax), %rax
	movq	%rax, %rbx
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEE4baseEv
	movq	(%rax), %rax
	subq	%rax, %rbx
	movq	%rbx, %rax
	sarq	$3, %rax
	movq	%rax, %rdx
	movabsq	$-3689348814741910323, %rax
	imulq	%rdx, %rax
	addq	$24, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1512:
	.size	_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_, .-_ZN9__gnu_cxxmiIP6SymbolSt6vectorIS1_SaIS1_EEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS9_SC_
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm:
.LFB1513:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	cmpq	$0, -16(%rbp)
	je	.L264
	movq	-8(%rbp), %rax
	movq	-16(%rbp), %rdx
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m
	jmp	.L266
.L264:
	movl	$0, %eax
.L266:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1513:
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EE11_M_allocateEm
	.section	.text._ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv,"axG",@progbits,_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv,comdat
	.align 2
	.weak	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	.type	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv, @function
_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv:
.LFB1514:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1514:
	.size	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv, .-_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	.section	.text._ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_,"axG",@progbits,_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_,comdat
	.weak	_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_
	.type	_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_, @function
_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_:
.LFB1515:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	%rcx, -32(%rbp)
	movq	-32(%rbp), %rcx
	movq	-24(%rbp), %rdx
	movq	-16(%rbp), %rsi
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1515:
	.size	_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_, .-_ZSt34__uninitialized_move_if_noexcept_aIP6SymbolS1_SaIS0_EET0_T_S4_S3_RT1_
	.section	.text._ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_,"axG",@progbits,_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_,comdat
	.weak	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_
	.type	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_, @function
_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_:
.LFB1516:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rdx
	movq	-8(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1516:
	.size	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_, .-_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE7destroyERS2_PS1_
	.section	.text._ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E,"axG",@progbits,_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E,comdat
	.weak	_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E
	.type	_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E, @function
_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E:
.LFB1517:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	-16(%rbp), %rdx
	movq	-8(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZSt8_DestroyIP6SymbolEvT_S2_
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1517:
	.size	_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E, .-_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E
	.section	.text._ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_,"axG",@progbits,_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC5ERKS2_,comdat
	.align 2
	.weak	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_
	.type	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_, @function
_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_:
.LFB1519:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rax
	movq	(%rax), %rdx
	movq	-8(%rbp), %rax
	movq	%rdx, (%rax)
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1519:
	.size	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_, .-_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_
	.weak	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC1ERKS2_
	.set	_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC1ERKS2_,_ZN9__gnu_cxx17__normal_iteratorIP6SymbolSt6vectorIS1_SaIS1_EEEC2ERKS2_
	.section	.text._ZNSaI6SymbolEC2Ev,"axG",@progbits,_ZNSaI6SymbolEC5Ev,comdat
	.align 2
	.weak	_ZNSaI6SymbolEC2Ev
	.type	_ZNSaI6SymbolEC2Ev, @function
_ZNSaI6SymbolEC2Ev:
.LFB1544:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1544:
	.size	_ZNSaI6SymbolEC2Ev, .-_ZNSaI6SymbolEC2Ev
	.weak	_ZNSaI6SymbolEC1Ev
	.set	_ZNSaI6SymbolEC1Ev,_ZNSaI6SymbolEC2Ev
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolED5Ev,comdat
	.align 2
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev
	.type	_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev, @function
_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev:
.LFB1547:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1547:
	.size	_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev, .-_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolED1Ev
	.set	_ZN9__gnu_cxx13new_allocatorI6SymbolED1Ev,_ZN9__gnu_cxx13new_allocatorI6SymbolED2Ev
	.section	.text._ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m,"axG",@progbits,_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m,comdat
	.weak	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m
	.type	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m, @function
_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m:
.LFB1549:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	-24(%rbp), %rdx
	movq	-16(%rbp), %rcx
	movq	-8(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1549:
	.size	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m, .-_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE10deallocateERS2_PS1_m
	.section	.text._ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_,"axG",@progbits,_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_,comdat
	.weak	_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_
	.type	_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_, @function
_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_:
.LFB1557:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1557:
	.size	_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_, .-_ZSt12__miter_baseIP6SymbolENSt11_Miter_baseIT_E13iterator_typeES3_
	.section	.text._ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_,"axG",@progbits,_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_,comdat
	.weak	_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_
	.type	_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_, @function
_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_:
.LFB1558:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r12
	pushq	%rbx
	subq	$32, %rsp
	.cfi_offset 12, -24
	.cfi_offset 3, -32
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	%rdx, -40(%rbp)
	movq	-40(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_
	movq	%rax, %r12
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_
	movq	%rax, %rbx
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_
	movq	%r12, %rdx
	movq	%rbx, %rsi
	movq	%rax, %rdi
	call	_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_
	addq	$32, %rsp
	popq	%rbx
	popq	%r12
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1558:
	.size	_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_, .-_ZSt23__copy_move_backward_a2ILb0EP6SymbolS1_ET1_T0_S3_S2_
	.section	.text._ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv,"axG",@progbits,_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv,comdat
	.align 2
	.weak	_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv
	.type	_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv, @function
_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv:
.LFB1559:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1559:
	.size	_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv, .-_ZNKSt6vectorI6SymbolSaIS0_EE8max_sizeEv
	.section	.text._ZSt3maxImERKT_S2_S2_,"axG",@progbits,_ZSt3maxImERKT_S2_S2_,comdat
	.weak	_ZSt3maxImERKT_S2_S2_
	.type	_ZSt3maxImERKT_S2_S2_, @function
_ZSt3maxImERKT_S2_S2_:
.LFB1560:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-8(%rbp), %rax
	movq	(%rax), %rdx
	movq	-16(%rbp), %rax
	movq	(%rax), %rax
	cmpq	%rax, %rdx
	jnb	.L284
	movq	-16(%rbp), %rax
	jmp	.L285
.L284:
	movq	-8(%rbp), %rax
.L285:
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1560:
	.size	_ZSt3maxImERKT_S2_S2_, .-_ZSt3maxImERKT_S2_S2_
	.section	.text._ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m,"axG",@progbits,_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m,comdat
	.weak	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m
	.type	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m, @function
_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m:
.LFB1561:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rcx
	movq	-8(%rbp), %rax
	movl	$0, %edx
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1561:
	.size	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m, .-_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8allocateERS2_m
	.section	.text._ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E,"axG",@progbits,_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E,comdat
	.weak	_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E
	.type	_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E, @function
_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E:
.LFB1562:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	%rcx, -32(%rbp)
	movq	-24(%rbp), %rdx
	movq	-16(%rbp), %rcx
	movq	-8(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1562:
	.size	_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E, .-_ZSt22__uninitialized_copy_aIP6SymbolS1_S0_ET0_T_S3_S2_RSaIT1_E
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_,comdat
	.align 2
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_
	.type	_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_, @function
_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_:
.LFB1563:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1563:
	.size	_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_, .-_ZN9__gnu_cxx13new_allocatorI6SymbolE7destroyEPS1_
	.section	.text._ZSt8_DestroyIP6SymbolEvT_S2_,"axG",@progbits,_ZSt8_DestroyIP6SymbolEvT_S2_,comdat
	.weak	_ZSt8_DestroyIP6SymbolEvT_S2_
	.type	_ZSt8_DestroyIP6SymbolEvT_S2_, @function
_ZSt8_DestroyIP6SymbolEvT_S2_:
.LFB1564:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rdx
	movq	-8(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1564:
	.size	_ZSt8_DestroyIP6SymbolEvT_S2_, .-_ZSt8_DestroyIP6SymbolEvT_S2_
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolEC5Ev,comdat
	.align 2
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev
	.type	_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev, @function
_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev:
.LFB1567:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1567:
	.size	_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev, .-_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolEC1Ev
	.set	_ZN9__gnu_cxx13new_allocatorI6SymbolEC1Ev,_ZN9__gnu_cxx13new_allocatorI6SymbolEC2Ev
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m,comdat
	.align 2
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m
	.type	_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m, @function
_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m:
.LFB1569:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	-16(%rbp), %rax
	movq	%rax, %rdi
	call	_ZdlPv
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1569:
	.size	_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m, .-_ZN9__gnu_cxx13new_allocatorI6SymbolE10deallocateEPS1_m
	.section	.text._ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_,"axG",@progbits,_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_,comdat
	.weak	_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_
	.type	_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_, @function
_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_:
.LFB1576:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1576:
	.size	_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_, .-_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_
	.section	.text._ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_,"axG",@progbits,_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_,comdat
	.weak	_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_
	.type	_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_, @function
_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_:
.LFB1577:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt10_Iter_baseIP6SymbolLb0EE7_S_baseES1_
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1577:
	.size	_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_, .-_ZSt12__niter_baseIP6SymbolENSt11_Niter_baseIT_E13iterator_typeES3_
	.section	.text._ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_,"axG",@progbits,_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_,comdat
	.weak	_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_
	.type	_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_, @function
_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_:
.LFB1578:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$48, %rsp
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	%rdx, -40(%rbp)
	movb	$0, -1(%rbp)
	movq	-40(%rbp), %rdx
	movq	-32(%rbp), %rcx
	movq	-24(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1578:
	.size	_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_, .-_ZSt22__copy_move_backward_aILb0EP6SymbolS1_ET1_T0_S3_S2_
	.section	.text._ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_,"axG",@progbits,_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_,comdat
	.weak	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_
	.type	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_, @function
_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_:
.LFB1579:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1579:
	.size	_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_, .-_ZN9__gnu_cxx14__alloc_traitsISaI6SymbolEE8max_sizeERKS2_
	.section	.text._ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv,"axG",@progbits,_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv,comdat
	.align 2
	.weak	_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	.type	_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv, @function
_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv:
.LFB1580:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1580:
	.size	_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv, .-_ZNKSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	.section	.text._ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv,"axG",@progbits,_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv,comdat
	.align 2
	.weak	_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv
	.type	_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv, @function
_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv:
.LFB1581:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	movq	%rdx, -24(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv
	cmpq	-16(%rbp), %rax
	setb	%al
	testb	%al, %al
	je	.L305
	call	_ZSt17__throw_bad_allocv
.L305:
	movq	-16(%rbp), %rdx
	movq	%rdx, %rax
	salq	$2, %rax
	addq	%rdx, %rax
	salq	$3, %rax
	movq	%rax, %rdi
	call	_Znwm
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1581:
	.size	_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv, .-_ZN9__gnu_cxx13new_allocatorI6SymbolE8allocateEmPKv
	.section	.text._ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_,"axG",@progbits,_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_,comdat
	.weak	_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_
	.type	_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_, @function
_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_:
.LFB1582:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$48, %rsp
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	%rdx, -40(%rbp)
	movb	$1, -1(%rbp)
	movq	-40(%rbp), %rdx
	movq	-32(%rbp), %rcx
	movq	-24(%rbp), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
	call	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1582:
	.size	_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_, .-_ZSt18uninitialized_copyIP6SymbolS1_ET0_T_S3_S2_
	.section	.text._ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_,"axG",@progbits,_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_,comdat
	.weak	_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_
	.type	_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_, @function
_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_:
.LFB1583:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	%rsi, -16(%rbp)
.L311:
	movq	-8(%rbp), %rax
	cmpq	-16(%rbp), %rax
	je	.L312
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt11__addressofI6SymbolEPT_RS1_
	movq	%rax, %rdi
	call	_ZSt8_DestroyI6SymbolEvPT_
	addq	$40, -8(%rbp)
	jmp	.L311
.L312:
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1583:
	.size	_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_, .-_ZNSt12_Destroy_auxILb0EE9__destroyIP6SymbolEEvT_S4_
	.section	.text._ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_,"axG",@progbits,_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_,comdat
	.weak	_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_
	.type	_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_, @function
_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_:
.LFB1590:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$48, %rsp
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	%rdx, -40(%rbp)
	movq	-32(%rbp), %rdx
	movq	-24(%rbp), %rax
	subq	%rax, %rdx
	movq	%rdx, %rax
	sarq	$3, %rax
	movq	%rax, %rdx
	movabsq	$-3689348814741910323, %rax
	imulq	%rdx, %rax
	movq	%rax, -8(%rbp)
.L315:
	cmpq	$0, -8(%rbp)
	jle	.L314
	subq	$40, -32(%rbp)
	subq	$40, -40(%rbp)
	movq	-32(%rbp), %rdx
	movq	-40(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	_ZN6SymbolaSERKS_
	subq	$1, -8(%rbp)
	jmp	.L315
.L314:
	movq	-40(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1590:
	.size	_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_, .-_ZNSt20__copy_move_backwardILb0ELb0ESt26random_access_iterator_tagE13__copy_move_bIP6SymbolS4_EET0_T_S6_S5_
	.section	.text._ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv,"axG",@progbits,_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv,comdat
	.align 2
	.weak	_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv
	.type	_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv, @function
_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv:
.LFB1591:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movabsq	$461168601842738790, %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1591:
	.size	_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv, .-_ZNK9__gnu_cxx13new_allocatorI6SymbolE8max_sizeEv
	.section	.text._ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_,"axG",@progbits,_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_,comdat
	.weak	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_
	.type	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_, @function
_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_:
.LFB1592:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1592
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$56, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -40(%rbp)
	movq	%rsi, -48(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-56(%rbp), %rax
	movq	%rax, -24(%rbp)
.L321:
	movq	-40(%rbp), %rax
	cmpq	-48(%rbp), %rax
	je	.L320
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZSt11__addressofI6SymbolEPT_RS1_
	movq	%rax, %rdx
	movq	-40(%rbp), %rax
	movq	%rax, %rsi
	movq	%rdx, %rdi
.LEHB96:
	call	_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_
.LEHE96:
	addq	$40, -40(%rbp)
	addq	$40, -24(%rbp)
	jmp	.L321
.L320:
	movq	-24(%rbp), %rax
	jmp	.L327
.L325:
	movq	%rax, %rdi
	call	__cxa_begin_catch
	movq	-24(%rbp), %rdx
	movq	-56(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
.LEHB97:
	call	_ZSt8_DestroyIP6SymbolEvT_S2_
	call	__cxa_rethrow
.LEHE97:
.L326:
	movq	%rax, %rbx
	call	__cxa_end_catch
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB98:
	call	_Unwind_Resume
.LEHE98:
.L327:
	addq	$56, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1592:
	.section	.gcc_except_table
	.align 4
.LLSDA1592:
	.byte	0xff
	.byte	0x3
	.uleb128 .LLSDATT1592-.LLSDATTD1592
.LLSDATTD1592:
	.byte	0x1
	.uleb128 .LLSDACSE1592-.LLSDACSB1592
.LLSDACSB1592:
	.uleb128 .LEHB96-.LFB1592
	.uleb128 .LEHE96-.LEHB96
	.uleb128 .L325-.LFB1592
	.uleb128 0x1
	.uleb128 .LEHB97-.LFB1592
	.uleb128 .LEHE97-.LEHB97
	.uleb128 .L326-.LFB1592
	.uleb128 0
	.uleb128 .LEHB98-.LFB1592
	.uleb128 .LEHE98-.LEHB98
	.uleb128 0
	.uleb128 0
.LLSDACSE1592:
	.byte	0x1
	.byte	0
	.align 4
	.long	0

.LLSDATT1592:
	.section	.text._ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_,"axG",@progbits,_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_,comdat
	.size	_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_, .-_ZNSt20__uninitialized_copyILb0EE13__uninit_copyIP6SymbolS3_EET0_T_S5_S4_
	.section	.text._ZSt11__addressofI6SymbolEPT_RS1_,"axG",@progbits,_ZSt11__addressofI6SymbolEPT_RS1_,comdat
	.weak	_ZSt11__addressofI6SymbolEPT_RS1_
	.type	_ZSt11__addressofI6SymbolEPT_RS1_, @function
_ZSt11__addressofI6SymbolEPT_RS1_:
.LFB1593:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1593:
	.size	_ZSt11__addressofI6SymbolEPT_RS1_, .-_ZSt11__addressofI6SymbolEPT_RS1_
	.section	.text._ZSt8_DestroyI6SymbolEvPT_,"axG",@progbits,_ZSt8_DestroyI6SymbolEvPT_,comdat
	.weak	_ZSt8_DestroyI6SymbolEvPT_
	.type	_ZSt8_DestroyI6SymbolEvPT_, @function
_ZSt8_DestroyI6SymbolEvPT_:
.LFB1594:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	_ZN6SymbolD1Ev
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1594:
	.size	_ZSt8_DestroyI6SymbolEvPT_, .-_ZSt8_DestroyI6SymbolEvPT_
	.section	.text._ZSt10_ConstructI6SymbolS0_EvPT_RKT0_,"axG",@progbits,_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_,comdat
	.weak	_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_
	.type	_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_, @function
_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_:
.LFB1597:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1597
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%r13
	pushq	%r12
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 13, -24
	.cfi_offset 12, -32
	.cfi_offset 3, -40
	movq	%rdi, -40(%rbp)
	movq	%rsi, -48(%rbp)
	movq	-40(%rbp), %r12
	movq	%r12, %rsi
	movl	$40, %edi
	call	_ZnwmPv
	movq	%rax, %rbx
	testq	%rbx, %rbx
	je	.L336
	movq	-48(%rbp), %rax
	movq	%rax, %rsi
	movq	%rbx, %rdi
.LEHB99:
	call	_ZN6SymbolC1ERKS_
.LEHE99:
	jmp	.L336
.L335:
	movq	%rax, %r13
	movq	%r12, %rsi
	movq	%rbx, %rdi
	call	_ZdlPvS_
	movq	%r13, %rax
	movq	%rax, %rdi
.LEHB100:
	call	_Unwind_Resume
.LEHE100:
.L336:
	nop
	addq	$24, %rsp
	popq	%rbx
	popq	%r12
	popq	%r13
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1597:
	.section	.gcc_except_table
.LLSDA1597:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1597-.LLSDACSB1597
.LLSDACSB1597:
	.uleb128 .LEHB99-.LFB1597
	.uleb128 .LEHE99-.LEHB99
	.uleb128 .L335-.LFB1597
	.uleb128 0
	.uleb128 .LEHB100-.LFB1597
	.uleb128 .LEHE100-.LEHB100
	.uleb128 0
	.uleb128 0
.LLSDACSE1597:
	.section	.text._ZSt10_ConstructI6SymbolS0_EvPT_RKT0_,"axG",@progbits,_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_,comdat
	.size	_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_, .-_ZSt10_ConstructI6SymbolS0_EvPT_RKT0_
	.text
	.type	_Z41__static_initialization_and_destruction_0ii, @function
_Z41__static_initialization_and_destruction_0ii:
.LFB1598:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	%edi, -4(%rbp)
	movl	%esi, -8(%rbp)
	cmpl	$1, -4(%rbp)
	jne	.L339
	cmpl	$65535, -8(%rbp)
	jne	.L339
	movl	$_ZStL8__ioinit, %edi
	call	_ZNSt8ios_base4InitC1Ev
	movl	$__dso_handle, %edx
	movl	$_ZStL8__ioinit, %esi
	movl	$_ZNSt8ios_base4InitD1Ev, %edi
	call	__cxa_atexit
	movl	$symbols, %edi
	call	_ZNSt6vectorI6SymbolSaIS0_EEC1Ev
	movl	$__dso_handle, %edx
	movl	$symbols, %esi
	movl	$_ZNSt6vectorI6SymbolSaIS0_EED1Ev, %edi
	call	__cxa_atexit
	movl	$_Z5inputB5cxx11, %edi
	call	_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1Ev
	movl	$__dso_handle, %edx
	movl	$_Z5inputB5cxx11, %esi
	movl	$_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev, %edi
	call	__cxa_atexit
.L339:
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1598:
	.size	_Z41__static_initialization_and_destruction_0ii, .-_Z41__static_initialization_and_destruction_0ii
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EED2Ev,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EED5Ev,comdat
	.align 2
	.weak	_ZNSt6vectorI6SymbolSaIS0_EED2Ev
	.type	_ZNSt6vectorI6SymbolSaIS0_EED2Ev, @function
_ZNSt6vectorI6SymbolSaIS0_EED2Ev:
.LFB1600:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	.cfi_lsda 0x3,.LLSDA1600
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -24(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EE19_M_get_Tp_allocatorEv
	movq	%rax, %rdx
	movq	-24(%rbp), %rax
	movq	8(%rax), %rcx
	movq	-24(%rbp), %rax
	movq	(%rax), %rax
	movq	%rcx, %rsi
	movq	%rax, %rdi
.LEHB101:
	call	_ZSt8_DestroyIP6SymbolS0_EvT_S2_RSaIT0_E
.LEHE101:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
.LEHB102:
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev
.LEHE102:
	jmp	.L343
.L342:
	movq	%rax, %rbx
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	_ZNSt12_Vector_baseI6SymbolSaIS0_EED2Ev
	movq	%rbx, %rax
	movq	%rax, %rdi
.LEHB103:
	call	_Unwind_Resume
.LEHE103:
.L343:
	addq	$24, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1600:
	.section	.gcc_except_table
.LLSDA1600:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1600-.LLSDACSB1600
.LLSDACSB1600:
	.uleb128 .LEHB101-.LFB1600
	.uleb128 .LEHE101-.LEHB101
	.uleb128 .L342-.LFB1600
	.uleb128 0
	.uleb128 .LEHB102-.LFB1600
	.uleb128 .LEHE102-.LEHB102
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB103-.LFB1600
	.uleb128 .LEHE103-.LEHB103
	.uleb128 0
	.uleb128 0
.LLSDACSE1600:
	.section	.text._ZNSt6vectorI6SymbolSaIS0_EED2Ev,"axG",@progbits,_ZNSt6vectorI6SymbolSaIS0_EED5Ev,comdat
	.size	_ZNSt6vectorI6SymbolSaIS0_EED2Ev, .-_ZNSt6vectorI6SymbolSaIS0_EED2Ev
	.weak	_ZNSt6vectorI6SymbolSaIS0_EED1Ev
	.set	_ZNSt6vectorI6SymbolSaIS0_EED1Ev,_ZNSt6vectorI6SymbolSaIS0_EED2Ev
	.text
	.type	_GLOBAL__sub_I_symbols, @function
_GLOBAL__sub_I_symbols:
.LFB1602:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movl	$65535, %esi
	movl	$1, %edi
	call	_Z41__static_initialization_and_destruction_0ii
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1602:
	.size	_GLOBAL__sub_I_symbols, .-_GLOBAL__sub_I_symbols
	.section	.init_array,"aw"
	.align 8
	.quad	_GLOBAL__sub_I_symbols
	.hidden	__dso_handle
	.ident	"GCC: (Ubuntu 5.4.0-6ubuntu1~16.04.4) 5.4.0 20160609"
	.section	.note.GNU-stack,"",@progbits
